/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package procesoso;

/**
 *
 * @author JUAN
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
public class ArchivoInfo {
	public enum Timefield {
		CREATED, ACCESSED, WRITTEN
	}
	private final static DateFormat FORMATTER = new SimpleDateFormat("dd/MM/yyyy  hh:mm");
        
        //private final static DateFormat FORMATTER = new SimpleDateFormat();
	private File file;
	private boolean hasLoaded = false;
	private String owner;
	private Map<Timefield, Date> timefields = new HashMap<Timefield, Date>();
        public DateFormat df = DateFormat.getDateInstance();
        public DateFormat hora = new SimpleDateFormat("HH:mm:ss");
	public ArchivoInfo(File file) {
            try{
		this.file = file;
            }catch(Exception e){System.out.println(e);}
	}
	private String getTimefieldSwitch(Timefield field) {
		switch (field) {
		case CREATED:
			return "C";
		case ACCESSED:
			return "A";
		default:
			return "W";
		}
	}
	private void shellToDir(Timefield timefield) throws IOException,
			ParseException {
            try{
		Runtime systemShell = Runtime.getRuntime();
		Process output = systemShell.exec(String.format("cmd /c dir /Q /R /T%s %s ", getTimefieldSwitch(timefield), file.getAbsolutePath()));
		BufferedReader reader = new BufferedReader(new InputStreamReader(output.getInputStream()));
		String outputLine;
                String Fecha;
		while ((outputLine = reader.readLine()) != null) {
			if (outputLine.contains(file.getName())) {
                            Fecha = outputLine.substring(0, 17);                            
                            timefields.put(timefield,(Date)FORMATTER.parse(Fecha));
                            owner = outputLine.substring(36, 59);
                            System.out.println(outputLine);
			}
		}
                
            }catch(Exception ex){System.out.println(ex);}                
	}
	private void load() throws IOException, ParseException {
		if (hasLoaded)
			return;
		shellToDir(Timefield.CREATED);
		shellToDir(Timefield.ACCESSED);
		shellToDir(Timefield.WRITTEN);
	}
        
	public String getName() {
		return file.getName();
	}
	public String getAbsolutePath() {
		return file.getAbsolutePath();
	}
	public long getSize() {
		return file.length();
	}
	public Date getLastModified() {
		return new Date(file.lastModified());
	}
	public String getOwner() throws IOException, ParseException {
		load();
		return owner;
	}
	public Date getCreated() throws IOException, ParseException {
		load();
		return timefields.get(Timefield.CREATED);
	}
	public Date getAccessed() throws IOException, ParseException {
		load();
		return timefields.get(Timefield.ACCESSED);
	}
	public Date getWritten() throws IOException, ParseException {
		load();
		return timefields.get(Timefield.WRITTEN);
	}
        public String getExt(){
            StringTokenizer tokens = new StringTokenizer(file.getName(),".");
            tokens.nextToken();
            tokens.hasMoreElements();
            return "*."+tokens.nextToken();
        }
       
}

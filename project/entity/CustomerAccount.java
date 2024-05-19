package project.entity;
import java.io.*;

public class CustomerAccount{

    protected String username;
    protected String userpassword;
    protected String userAppleId;
    protected String userphone;

    private File file;
    private FileWriter fwrite;

    public CustomerAccount (){

    }

    public CustomerAccount(String username,String userAppleId,String userpassword,String userphone){

        this.username=username;
        this.userAppleId=userAppleId;
        this.userpassword=userpassword;
        this.userphone=userphone;

    }
    public String getUsername() {

        return username;
    }
    public void setUsername(String username) {

        this.username = username;
    }
    public String getUserpassword() {

        return userpassword;
    }
    public void setUserpassword(String userpassword) {

        this.userpassword = userpassword;
    }
    public String getUserAppleId() {

        return userAppleId;
    }
    public void setUserAppleId(String userAppleId) {

        this.userAppleId = userAppleId;
    }
    public String getUserphone() {

        return userphone;
    }
    public void setUserphone(String userphone) {

        this.userphone = userphone;
    }
    public void addusraccount(){

        try{
            file = new File("project/data/data.txt");

            if(!file.exists()){
                boolean newFile = file.createNewFile();
            }
            fwrite = new FileWriter(file,true);

            fwrite.write(getUsername()+"\t");
            fwrite.write(getUserphone()+"\t");
            fwrite.write(getUserAppleId()+"\t");
            fwrite.write(getUserpassword()+"\n");
            fwrite.flush();
        
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
        public boolean UserLogIn(String userAppleId, String userpassword) {
            FileReader fr = null;
            BufferedReader br = null;
            boolean flag = false;
            try {
                file = new File("project/data/data.txt");
                fr = new FileReader(file);
                br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split("\t");
                    if (values[1].equals(userpassword) && values[3].equals(userAppleId) ) {
                        flag = true;
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return flag;
        }
}

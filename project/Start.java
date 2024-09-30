package project;
import project.mainFrames.MainFrame;
import project.subFrames.Login;

public class Start {
    public static void main(String[] args) {
        MainFrame logIn = new Login();
        logIn.setVisible(true);
    }
}





































    //     public void actionPerformed(ActionEvent ae) {
    //         if (ae.getActionCommand().equals(" REGISTER ")) {
    //             Register register = new Register();
    //             register.setVisible(true);
    //             this.setVisible(false);
    //         } else if (ae.getActionCommand().equals(" LOG IN ")) {
    //             // Handle login button click
    //         } else if (ae.getActionCommand().equals(" Forget Password? ")) {
    //             // Handle forget password button click
    //         }
    //     }
    // }
    // }
package MySelf.Group25;

public class CaesarChiper_Task_Group25 {

    public static void main(String[] args) {

        String encryptedMessage = "X GLROKBV LC X QELRPXKA JFIBP YBDFKP TFQE X PFKDIB PQBM";
        String decryptedMessage = "";
        //A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
        for (int i = 0; i < encryptedMessage.length(); i++) {
            int ch = encryptedMessage.charAt(i);
            if (ch=='X'||ch=='Y'||ch=='Z') {
                ch = ch-26;
            } else if (ch==' '){
                ch = 29;
            }
            decryptedMessage+=(char)(ch+3);
        }

        System.out.println(decryptedMessage);
    }

}

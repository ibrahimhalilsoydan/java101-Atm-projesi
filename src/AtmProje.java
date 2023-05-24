import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;

        int hak =3;
        int bakiye =1500;
        int seçim;

        while (hak > 0) {
            System.out.print("kullanıcı adını giriniz :");
            userName = input.nextLine();
            System.out.print("Parolanız :");
            password= input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){

                System.out.println("Bankamıza hoşgeldiniz . Girişiniz başarılı bir şekilde gerçekleşti.");
                do {
                    System.out.println("1.Para yatırma\n2.Para çekme\n3.Bakiye sorgulama\n4.Çıkış yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
                    seçim=input.nextInt();
                    switch (seçim){
                        case 1:
                            System.out.print("Yatırılacak para tutarı :");
                            int para =input.nextInt();
                            bakiye +=para;
                            break;

                        case 2:
                            System.out.print("Çekilecek para tutarı:");
                             para =input.nextInt();

                           if (para > bakiye){
                               System.out.println("-----Yetersiz bakiye.-------");
                           }else {
                               bakiye -= para;
                           }
                           break;

                        case 3:
                          System.out.println("-----Bakiyeniz :" + bakiye +" TL------");

                    }

                }while (seçim != 4 );
                break;
            }else {
                hak--;
                System.out.println("Bilgiler hatalı tekrar deneyiniz.");
                if (hak==0){
                    System.out.print( "Kalan hakkınız : "+hak+ "| Üç kez hatalı giriş yaptınız. hesabınız bloke edildi.");
                }else
                    System.out.println("Kalan hakkınız :" + hak);
            }



        }
    }
}

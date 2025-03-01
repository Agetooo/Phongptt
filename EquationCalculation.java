import javax.swing.JOptionPane;
public class EquationCalculation {
	public static void main(String[] args) {
        String choice;

        while (true) {
            choice = JOptionPane.showInputDialog(
                    null, "1. Pt Bac nhat 1 an\n" +
                            "2. Pt Bac nhat 2 an\n" +
                            "3. Pt Bac hai 1 an\n" +
                            "4. Exit",
                    "Chon loai phuong trinh can giai",JOptionPane.INFORMATION_MESSAGE);
            if (choice == null || choice.equals("4")) { 
                break; 
            }

            switch (choice) {
                case "1" -> bac11an();
                case "2" -> bac12an();
                case "3" -> bac2();
                default -> JOptionPane.showMessageDialog(null, "Invalid");
            }
        }
    }

    public static void bac11an() {
        String strA = JOptionPane.showInputDialog("Nhap a khac 0");
        String strB = JOptionPane.showInputDialog("Nhap b");

        try {
            double a = Double.parseDouble(strA);
            double b = Double.parseDouble(strB);

            if (a == 0) {
                JOptionPane.showMessageDialog(null, "a phai khac 0");
            } else {
                double x = -b / a;
                JOptionPane.showMessageDialog(null, "x = " + x);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Hay nhap so");
        }
    }

    public static void bac12an() {
        try {
            double a11 = Double.parseDouble(JOptionPane.showInputDialog("Nhap a11:"));
            double a12 = Double.parseDouble(JOptionPane.showInputDialog("Nhap a12:"));
            double b1 = Double.parseDouble(JOptionPane.showInputDialog("Nhap b1:"));
            double a21 = Double.parseDouble(JOptionPane.showInputDialog("Nhap a21:"));
            double a22 = Double.parseDouble(JOptionPane.showInputDialog("Nhap a22:"));
            double b2 = Double.parseDouble(JOptionPane.showInputDialog("Nhap b2:"));

            double D = a11 * a22 - a21 * a12;
            double D1 = b1 * a22 - b2 * a12;
            double D2 = a11 * b2 - a21 * b1;

            if (D == 0) {
                if (D1 == 0 && D2 == 0) {
                    JOptionPane.showMessageDialog(null, "Pt vo so nghiem");
                } else {
                    JOptionPane.showMessageDialog(null, "Pt vo nghiem");
                }
            } else {
                double x1 = D1 / D;
                double x2 = D2 / D;
                JOptionPane.showMessageDialog(null, "Ngiem cua he la:\nx1 = " + x1 + "\nx2 = " + x2);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Hay nhap so");
        }
    }

    public static void bac2() {
        String strA = JOptionPane.showInputDialog("Nhap a");
        String strB = JOptionPane.showInputDialog("Nhap b");
        String strC = JOptionPane.showInputDialog("Nhap c");

        try {
            double a = Double.parseDouble(strA);
            double b = Double.parseDouble(strB);
            double c = Double.parseDouble(strC);

            if (a == 0) {
            	double x = -c / b;
                JOptionPane.showMessageDialog(null, "x = " + x);
                return;
            }

            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "Pt co 2 nghiem phan biet:\n x1 = " + x1 + "\n x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "Pt co nghiem kep: x = " + x);
            } else {
                JOptionPane.showMessageDialog(null, "Pt vo nghiem.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Hay nhap so");
        }
    }
}

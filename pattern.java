 class pattern {
    public static void main(String[] args) {
        int rows = 4;
        int k, l;
        String s1 = "";
        String s2 = "";
        for (int i=0;i<rows;i++) {
            for (int j=0;j<i;j++) {
                System.out.print("  ");
            }
            for (k=65;k<rows+65-i;k++) {
                s1 = Character.toString(k);
                System.out.print(s1 + " ");
            }
            for (l=k-2;l>=65;l--) {
                s2 = Character.toString(l);
                System.out.print(s2 + " ");
            }
            System.out.println();
        }
    }
}
class DefangingIpAddress {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("255.100.50.0"));
    }
    public static String defangIPaddr(String address) {
        String a = address.replace(".", "[.]");
        return a;
    }
}
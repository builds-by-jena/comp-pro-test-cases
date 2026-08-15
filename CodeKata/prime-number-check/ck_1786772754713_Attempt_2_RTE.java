}
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLong()) {
            long n = sc.nextLong();
            if (isPrime(n)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }
}
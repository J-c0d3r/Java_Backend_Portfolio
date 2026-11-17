public static void main(String[] args) {

    Thread worker = new Thread(() -> {
        try {
            Thread.sleep(1000);
            System.out.println("Worker continua vivo!");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    });

    worker.start();

    throw new RuntimeException("Falha na main!");
}
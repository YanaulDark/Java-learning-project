public class TestDownloadAnimation {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <= 100; i += 10) {
            // \r возвращает курсор в начало, а System.out.print не переводит строку
            System.out.print("\rЗагрузка: " + i + "%");
            Thread.sleep(300); // Пауза для наглядности
        }
        System.out.println("\nГотово!"); // Переводим строку в конце
    }
}


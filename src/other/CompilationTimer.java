package other;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import java.util.ArrayList;
import java.util.List;

public class CompilationTimer {
    /**
     * Компилирует указанные файлы и возвращает время компиляции в наносекундах.
     *
     * @param fileNames Список имён файлов для компиляции.
     * @return Время компиляции в наносекундах.
     */

    public static long compileFiles(List<String> fileNames) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        if (compiler == null) {
            throw new IllegalStateException("Системный компилятор Java не найден. Убедитесь, что вы используете JDK, а не JRE.");
        }

        long startTime = System.nanoTime();

        // Преобразуем список имён файлов в массив аргументов для компилятора
        List<String> options = new ArrayList<>();
        options.add("-d");
        options.add("out"); // Указываем директорию для скомпилированных классов
        options.addAll(fileNames);

        // Запускаем компиляцию
        int result = compiler.run(null, null, null, options.toArray(new String[0]));

        long endTime = System.nanoTime();

        if (result != 0) {
            throw new RuntimeException("Ошибка компиляции.");
        }

        return endTime - startTime;
    }
}

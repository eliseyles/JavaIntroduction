//4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”

package by.training.eliseyles.strings.stringobject;

public class Task4 {
    public static void main(String[] args) {
        String st = "информатика";

        char[] ch = {st.charAt(7)};
        String st1 = new String(ch);

        char[] ch1 = st.toCharArray();
        StringBuilder strb = new StringBuilder();
        strb = strb.append(ch1, 3, 2);

        StringBuilder stb = new StringBuilder(st1 + strb + st1);
        System.out.println(stb);
    }
}

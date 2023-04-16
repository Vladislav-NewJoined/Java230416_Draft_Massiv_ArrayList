import java.util.ArrayList;

public class Test {
    /* Создавать массивы: skillbox https://skillbox.ru/media/base/massivy_v_java_sozdayem_zapolnyaem_ispolzuem/
JavaRush https://javarush.com/groups/posts/klass-arraylist
видео Neil Alishev ( Наиль Алишев ) https://youtu.be/QCjLMw988kQ про документацию классов здесь ( самый конец )
видео https://youtu.be/UjkqeSDSUgc */
    public static void main(String[] args) {
        int[] x = new int[4];
        for(int i = 0; i < 4; i++) {
            x[i] = 1;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++ ) {
            arrayList.add(i);
        }
//        arrayList.remove(5);
        int str = 888;
        arrayList.add(str);

        System.out.println(arrayList);
//
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(99));
//
//        System.out.println(arrayList.size());
//
//        for(int i = 0; i < arrayList.size(); i++ ) {
//            System.out.println(arrayList.get(i));
//    }

//        for(Integer x2 : arrayList)
//            System.out.println(x2);

//          По конвенции так надо создавать:
//          List<Integer> List = new ArrayList<>();


     }
}

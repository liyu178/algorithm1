import java.util.Scanner;

//任务：键盘输入一行英文句子，输出其中所有的单词，每行一个单词
//双指针算法
public class PrintWordsFromLine
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int len = str.length();      //只用计算一次字符串长度，避免以后用一次长度就调用一次方法

        for(int i = 0; i < len; i++)  //abc dwf ghi
        {
            int j = i;
            while(j < len && arr[j] != ' ' ) //两个条件不能反着写
            {
                j++;
            }
            for(int k = i; k < j ; k++)
            {
                System.out.print(arr[k]);
            }
            System.out.println();
            i = j;
        }

    }
}

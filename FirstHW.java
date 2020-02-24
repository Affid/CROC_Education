public class FirstHW {
    public static void main(String[] args) {
        printBytes(1500000999000000000L);
        sort(new int[]{1,2,6,-9,77});
    }

    public static void sort(int[] array){
        int minNum=-5, maxNum=-5, curr=Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<curr){
                minNum=i;
                curr = array[i];
            }
        }
        curr = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>curr){
                maxNum=i;
                curr = array[i];
            }
        }

        if(!(maxNum==0&&minNum==array.length-1)) {
            curr = array[maxNum];
            array[maxNum] = array[array.length - 1];
            array[array.length - 1] = curr;

            curr = array[minNum];
            array[minNum] = array[0];
            array[0] = curr;
        }
        else {
            curr = array[minNum];
            array[minNum] = array[maxNum];
            array[maxNum] = curr;
        }

        for(int i: array){
            System.out.print(i+" ");
        }
    }

    public static void printBytes(long bytes){
        int level = 0;
        float tempNum = bytes;
        boolean enough = false;
        while (!enough){
            if(tempNum/1024>=1){
                level++;
                tempNum/=1024;
            }
            else
                enough=true;
        }
        switch (level){
            case 0:
                System.out.println(String.format("%.1f",tempNum)+" B");
                break;
            case 1:
                System.out.println(String.format("%.1f",tempNum)+" KB");
                break;
            case 2:
                System.out.println(String.format("%.1f",tempNum)+" MB");
                break;
            case 3:
                System.out.println(String.format("%.1f",tempNum)+" GB");
                break;
            case 4:
                System.out.println(String.format("%.1f",tempNum)+" TB");
                break;
            case 5:
                System.out.println(String.format("%.1f",tempNum)+" PB");
                break;
            case 6:
                System.out.println(String.format("%.1f",tempNum)+" EB");
                break;
            case 7:
                System.out.println(String.format("%.1f",tempNum)+" ZB");
                break;
            case 8:
                System.out.println(String.format("%.1f",tempNum)+" YB");
                break;
            default:
                System.out.println("Very Big: " + bytes +" Bytes");
        }
    }
}

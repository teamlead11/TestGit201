package testpack;

public class Framework {

	public static void main(String[] args) {
		baseClassMethod();
		sortArrayJanani();
	}

	public static void baseClassMethod() {
		System.out.println("this is my base project");
	}
	public static void sortArrayJanani() {
		int a[]= {38,12,80,5,45};
		for (int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}System.out.print(a[i] + " ");
		}
	}
}

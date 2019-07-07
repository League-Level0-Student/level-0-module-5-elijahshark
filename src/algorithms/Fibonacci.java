package algorithms;

public class Fibonacci {
public static void main(String[] args) {
	int nn = 1;
	int n = 0;
int q; 
for(int i = 0; i < 12; i++) {
q = n + nn;
n = nn;
nn = q;
System.out.println(q);
}
}
}

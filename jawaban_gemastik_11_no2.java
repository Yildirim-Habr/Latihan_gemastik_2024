package pkgA;

import java.io.*;
import java.util.*;

/******************************\
 * The solution is at the top *
 *                            *
 *   Created by : azhar556    *
\******************************/
public class A {
	static boolean isLinier(int a, int b, int[][] koordinat) {
		int a0 = koordinat[a][0];
		int a1 = koordinat[a][1];
		int b0 = koordinat[b][0];
		int b1 = koordinat[b][1];

		if (a1 * b1 < 0 || a0 * b0 < 0) {
			return false;
		}

		if (a0 > a1 && b0 > b1) {
			if (a0 % a1 == 0 && b0 % b1 == 0) {
				if (a0 / a1 == b0 / b1) {
					return true;
				}
			}
		}
		else {
			if (a1 % a0 == 0 && b1 % b0 == 0) {
				if (a1 / a0 == b1 / b0) {
					return true;
				}
			}
		}
		
		return false;
	}
	static void solve() {
		int n = ni();
		int x = ni();
		int y = ni();
		int[][] koordinat = new int[n][2];
		for (int i = 0; i < n; i++) {
			koordinat[i][0] = ni() - x;
			koordinat[i][1] = ni() - y;
		}
		
		int[] kelompokMana = new int[n];
		Arrays.fill(kelompokMana, -1);
		kelompokMana[0] = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				
				if (kelompokMana[j] != -1) continue;
				
				if (isLinier(i, j, koordinat)) {
					kelompokMana[j] = i;

					
				}
			}
			if (kelompokMana[i] == -1) {
				kelompokMana[i] = i;
			}
		}
		
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (kelompokMana[i] == i) {
				ans++;
			}
		}
		out.println(ans);
    }    
 
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        //int t = ni();
        int t = 1;
        while (t-- > 0) solve(); 
        err.println("Time elapsed : " + (System.currentTimeMillis() - time) / 1000F + " s.");
        err.close(); out.close();
    }
 
	static int[] radixSort(int[] f){ return radixSort(f, f.length); }
	static int[] radixSort(int[] f, int n)
	{
		int[] to = new int[n];
		{
			int[] b = new int[65537];
			for(int i = 0;i < n;i++)b[1+(f[i]&0xffff)]++;
			for(int i = 1;i <= 65536;i++)b[i]+=b[i-1];
			for(int i = 0;i < n;i++)to[b[f[i]&0xffff]++] = f[i];
			int[] d = f; f = to;to = d;
		}
		{
			int[] b = new int[65537];
			for(int i = 0;i < n;i++)b[1+(f[i]>>>16)]++;
			for(int i = 1;i <= 65536;i++)b[i]+=b[i-1];
			for(int i = 0;i < n;i++)to[b[f[i]>>>16]++] = f[i];
			int[] d = f; f = to;to = d;
		}
		return f;
	}
 
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static PrintWriter err = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.err)));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer token;
        
    static String ns() {
        while (token == null || !token.hasMoreTokens()) {
            try {
                token = new StringTokenizer(br.readLine());
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return token.nextToken();
    }
    static char nc() {
        return Character.valueOf(ns().charAt(0));
    }
    static int ni() {
        return Integer.parseInt(ns());
    }
    static double nd() {
        return Double.parseDouble(ns());
    }
    static long nl() {
        return Long.parseLong(ns());
    }
}

// Collections Arrays Math
// Vector HashSet TreeSet HashMap TreeMap ArrayDeque 

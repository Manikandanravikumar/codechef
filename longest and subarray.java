#include <bits/stdc++.h>
using namespace std;

int largest_pow(int n) {
	int p = 1;
	while (p * 2 <= n) p *= 2;
	return p;
}

int main() {
	int t;
	cin >> t;
	while (t--) {
		int n;
		cin >> n; // n = 20
		int lp = largest_pow(n); // 16
		int seclp = lp / 2; // 8
		int ans1 = n - lp + 1; // [16, 20] -> 5
		int ans2 = lp - seclp; // [8, 15] -> 8
		cout << max(ans1, ans2) << '\n';
	}
}

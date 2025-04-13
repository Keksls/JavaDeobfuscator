/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Rx {
    private final String a;
    private final String[] b;

    public Rx(String string, String[] stringArray) {
        this.a = string;
        this.b = this.a(stringArray);
    }

    private String[] a(String[] stringArray) {
        if (stringArray == null) {
            return Rw.b;
        }
        int n = stringArray.length;
        ArrayList<String> arrayList = new ArrayList<String>(n);
        for (int k = 0; k < n; ++k) {
            for (String string : atn_2.a(stringArray[k])) {
                if (arrayList.contains(string)) continue;
                arrayList.add(string);
            }
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public String a() {
        return this.a;
    }

    public String[] b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Rx rx = (Rx)object;
        if (!this.a.equals(rx.a)) {
            return false;
        }
        return Arrays.equals(this.b, rx.b);
    }

    public int hashCode() {
        int n = this.a.hashCode();
        n = 31 * n + Arrays.hashCode(this.b);
        return n;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from dfC
 */
public class dfc_0
extends dfc {
    private final ArrayList<QP> a = new ArrayList();
    private String b;
    private String c;
    private boolean d;

    @Override
    public int a() {
        return 18477;
    }

    public void b(String string) {
        this.b = string;
    }

    public void c(String string) {
        this.c = string;
    }

    public void a(ArrayList<QP> arrayList) {
        this.a.addAll(arrayList);
    }

    public void a(Boolean bl) {
        this.d = bl;
    }

    public ArrayList<QP> k() {
        return this.a;
    }

    public String o() {
        return this.b;
    }

    public String p() {
        return this.c;
    }

    public Boolean q() {
        return this.d;
    }
}


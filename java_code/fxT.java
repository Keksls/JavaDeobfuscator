/*
 * Decompiled with CFR 0.152.
 */
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class fxT {
    private ArrayList<fxU> a;
    private ArrayList<Line2D> b;
    private int c;
    private int d;

    public fxT(ArrayList<fxU> arrayList, ArrayList<Line2D> arrayList2, int n, int n2) {
        this.c = n;
        this.d = n2;
        this.a = arrayList;
        this.b = arrayList2;
    }

    public ArrayList<fxU> a() {
        return this.a;
    }

    public void a(ArrayList<fxU> arrayList) {
        this.a = arrayList;
    }

    public int b() {
        return this.c;
    }

    public void a(int n) {
        this.c = n;
    }

    public int c() {
        return this.d;
    }

    public void b(int n) {
        this.d = n;
    }

    public ArrayList<Line2D> d() {
        return this.b;
    }

    public void b(ArrayList<Line2D> arrayList) {
        this.b = arrayList;
    }
}


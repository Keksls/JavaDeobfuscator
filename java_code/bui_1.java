/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bui
 */
public class bui_1
implements UG {
    private final int a;
    private final short b;
    private final apc_2 c;
    private final ArrayList<bue_0> d;

    public bui_1(int n, short s2, apc_2 apc_22) {
        this.a = n;
        this.b = s2;
        this.c = apc_22;
        this.d = new ArrayList();
    }

    public void a(bue_0 bue_02) {
        this.d.add(bue_02);
    }

    public ArrayList<bue_0> b() {
        return this.d;
    }

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public apc_2 d() {
        return this.c;
    }

    @Override
    public short c() {
        return this.b;
    }
}


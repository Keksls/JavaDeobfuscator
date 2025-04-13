/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;

public class btO
extends ou_0 {
    private String a;
    private TLongArrayList b;
    private boolean c = false;

    public btO() {
    }

    public btO(String string, TLongArrayList tLongArrayList) {
        this.a = string;
        this.b = tLongArrayList;
    }

    public btO(String string, TLongArrayList tLongArrayList, boolean bl) {
        this.a = string;
        this.b = tLongArrayList;
        this.c = bl;
    }

    @Override
    public int b() {
        return 3;
    }

    public String c() {
        return this.a;
    }

    public void a(String string) {
        this.a = string;
    }

    public TLongArrayList d() {
        return this.b;
    }

    public void a(TLongArrayList tLongArrayList) {
        this.b = tLongArrayList;
    }

    public boolean e() {
        return this.c;
    }
}


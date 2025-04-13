/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;

public class btP
extends btO {
    private float[] a;

    public btP() {
    }

    public btP(String string, TLongArrayList tLongArrayList, float[] fArray) {
        super(string, tLongArrayList);
        this.a = fArray;
    }

    public btP(String string, TLongArrayList tLongArrayList, boolean bl, float[] fArray) {
        super(string, tLongArrayList, bl);
        this.a = fArray;
    }

    public float[] f() {
        return this.a;
    }
}


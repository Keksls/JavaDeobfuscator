/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aKv
 */
class akv_1
extends ags_2 {
    final /* synthetic */ aks_1 a;

    akv_1(aks_1 aks_12, byte[] byArray) {
        this.a = aks_12;
        super(aks_12, byArray);
    }

    @Override
    public long a() {
        try {
            return ((byte[])this.b).length;
        }
        catch (NullPointerException nullPointerException) {
            return 0L;
        }
    }
}


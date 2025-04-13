/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bTU
 */
public enum btu_2 {
    a("patchCatalog", -1, fks_0.a),
    b("buildingCatalog", -2, fks_0.b),
    c("HavenWorldBuildingDeco", -3, fks_0.b),
    d("HavenWorldDungeon", 18, fks_0.b),
    e("partitionCatalog", -1, fks_0.c);

    private final String f;
    private final String g;
    private final int h;
    private final fks_0 i;

    private btu_2(String string2, int n2, fks_0 fks_02) {
        this(string2, n2, string2, fks_02);
    }

    private btu_2(String string2, int n2, String string3, fks_0 fks_02) {
        this.f = string2;
        this.g = string3;
        this.h = n2;
        this.i = fks_02;
    }

    public String a() {
        return this.f;
    }

    public String b() {
        return this.g;
    }

    public int c() {
        return this.h;
    }

    public fks_0 d() {
        return this.i;
    }
}


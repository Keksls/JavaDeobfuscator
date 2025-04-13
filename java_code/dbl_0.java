/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dbL
 */
class dbl_0
implements ans_1 {
    final /* synthetic */ dbJ a;

    dbl_0(dbJ dbJ2) {
        this.a = dbJ2;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("osamodasSymbiotDialog")) {
            azu_0.j().b(dbJ.a());
        } else if (string.startsWith("monsterDetailDialog") && this.a.c.contains(string)) {
            this.a.c.remove(string);
        }
    }
}


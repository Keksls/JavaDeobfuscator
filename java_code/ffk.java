/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

public enum ffk implements aqk_2
{
    a(0, "gemme de salle marchande", 4262, 11098),
    b(1, "gemme de salle de d\u00e9corations", 4263, 11100),
    c(2, "gemme de salle d'artisanat", 4264),
    d(3, "gemme de salle de Sufokia", 27572),
    e(4, "gemme de salle jardin", 4266, 11099),
    f(5, "gemme de salle Amakna", 27573),
    g(6, "gemme de salle Br\u00e2kmar", 27574),
    h(7, "gemme de salle Bonta", 27575);

    private static final TIntObjectHashMap<ffk> k;
    public final byte i;
    public final byte j;
    private final int[] l;
    private final String m;

    private ffk(byte by, String string2, int ... nArray) {
        this.i = by;
        this.j = (byte)(1 << by);
        this.l = nArray;
        this.m = string2;
    }

    public int a() {
        return this.l[0];
    }

    public byte b() {
        return this.i;
    }

    @Override
    public String d() {
        return Integer.toString(this.l[0]);
    }

    @Override
    public String e() {
        return this.name();
    }

    @Override
    public String f() {
        return this.m;
    }

    public static ffk a(int n) {
        return (ffk)k.get(n);
    }

    public static ffk c() {
        return a;
    }

    static {
        k = new TIntObjectHashMap();
        for (ffk ffk2 : ffk.values()) {
            for (int n : ffk2.l) {
                k.put(n, (Object)ffk2);
            }
        }
    }
}


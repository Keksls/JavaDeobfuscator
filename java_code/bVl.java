/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteLongIterator
 */
import gnu.trove.iterator.TByteLongIterator;
import java.text.NumberFormat;

class bVl
implements ajh_1 {
    public static final String a = "nationalFunds";
    public static final String b = "collectedTaxes";
    public static final String d = "totalCost";
    public static final String e = "challengeCost";
    public static final String f = "climateCost";
    private final fej_0 g;

    public bVl(fej_0 fej_02) {
        this.g = fej_02;
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return NumberFormat.getIntegerInstance().format(this.g.d()) + " \u00a7";
        }
        if (string.equals(b)) {
            long l = 0L;
            TByteLongIterator tByteLongIterator = this.g.c().iterator();
            while (tByteLongIterator.hasNext()) {
                tByteLongIterator.advance();
                l += tByteLongIterator.value();
            }
            if (l < 0L) {
                l = Integer.MAX_VALUE;
            }
            return NumberFormat.getIntegerInstance().format(l) + " \u00a7";
        }
        if (string.equals(d)) {
            long l = 0L;
            TByteLongIterator tByteLongIterator = this.g.b().iterator();
            while (tByteLongIterator.hasNext()) {
                tByteLongIterator.advance();
                l += tByteLongIterator.value();
            }
            if (l < 0L) {
                l = Integer.MAX_VALUE;
            }
            return NumberFormat.getIntegerInstance().format(l) + " \u00a7";
        }
        if (string.equals(e)) {
            long l = this.g.b().get(fgi_0.a.a());
            return NumberFormat.getIntegerInstance().format(l) + " \u00a7";
        }
        if (string.equals(f)) {
            long l = this.g.b().get(fgi_0.b.a());
            return NumberFormat.getIntegerInstance().format(l) + " \u00a7";
        }
        return null;
    }
}


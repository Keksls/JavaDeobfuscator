/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aoe
 */
public abstract class aoe_2
extends aod_2 {
    @Override
    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(').append("(\"([^\"\\\\]|\\\\(.|\n))*\")").append('|').append("([a-zA-Z]+)").append('|').append("([0-9]+)");
        for (aol_1 aol_12 : this.a) {
            String string = aol_12.a();
            if (string == null || string == null || string.isEmpty()) continue;
            stringBuilder.append('|').append(string);
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}


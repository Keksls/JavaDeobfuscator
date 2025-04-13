/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAQ
 */
public abstract class faq_1
extends faq_2 {
    public abstract boolean isValidInt(int var1, int var2);

    public abstract boolean isValidFloat(float var1, float var2);

    public abstract boolean isValidDouble(double var1, double var3);

    public abstract boolean isValidShort(short var1, short var2);

    public abstract boolean isValidLong(long var1, long var3);

    public abstract boolean isValidByte(byte var1, byte var2);

    @Override
    public boolean isValid(Object object) {
        Object object2;
        Object object3 = object2 = this.g ? this.f : object;
        if (object2 instanceof Integer) {
            return this.isValidInt(Co.c(object2), Co.c(this.e));
        }
        if (object2 instanceof Float) {
            return this.isValidFloat(Co.e(object2), Co.e(this.e));
        }
        if (object2 instanceof Double) {
            return this.isValidDouble(Co.d(object2), Co.d(this.e));
        }
        if (object2 instanceof Short) {
            return this.isValidShort(Co.h(object2), Co.h(this.e));
        }
        if (object2 instanceof Long) {
            return this.isValidLong(Co.f(object2), Co.f(this.e));
        }
        if (object2 instanceof Byte) {
            return this.isValidByte(Co.g(object2), Co.g(this.e));
        }
        if (object2 instanceof String) {
            return this.isValidDouble(Co.d(object2), Co.d(this.e));
        }
        return false;
    }
}


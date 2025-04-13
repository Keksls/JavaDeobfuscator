/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InaccessibleObjectException;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.log4j.Logger;

/*
 * Renamed from aDt
 */
public abstract class adt_1 {
    protected static final Logger A = Logger.getLogger(adt_1.class);
    private long a;
    private final AtomicReference<adv_1> b = new AtomicReference();

    public adv_1 l() {
        return this.b.get();
    }

    public void a(adv_1 adv_12) {
        this.b.set(adv_12);
    }

    public void m() {
        adv_1 adv_12 = this.b.get();
        if (adv_12 == null) {
            A.warn((Object)("Le message de type " + this.getClass().getSimpleName() + " n'a pas de destinataire."));
            return;
        }
        adv_12.a(this);
    }

    public abstract int a();

    public void a_(int n) {
    }

    public boolean a(int n, int n2, boolean bl) {
        if (bl) {
            if (n != n2) {
                A.error((Object)("****************************** Message de longueur incorrecte : re\u00e7u=" + n + " octet(s), attendu=" + n2 + " octet(s), type : " + this.getClass().getName()), (Throwable)new Exception("TRACE"));
                return false;
            }
        } else if (n < n2) {
            A.error((Object)("****************************** Message de longueur incorrecte : re\u00e7u=" + n + " octet(s), attendu >= " + n2 + " octet(s), type : " + this.getClass().getName()), (Throwable)new Exception("TRACE"));
            return false;
        }
        return true;
    }

    void d(long l) {
        this.a = l;
    }

    public long n() {
        return this.a;
    }

    public String toString() {
        return this.a(adt_1.class);
    }

    protected String a(Class<?> clazz) {
        StringBuilder stringBuilder = new StringBuilder(this.getClass().getSimpleName()).append('@').append(Integer.toHexString(this.hashCode())).append('{');
        try {
            Class<?> clazz2 = this.getClass();
            do {
                Field[] fieldArray;
                for (Field field : fieldArray = clazz2.getDeclaredFields()) {
                    if (Modifier.isStatic(field.getModifiers())) continue;
                    stringBuilder.append(field.getName()).append('=');
                    try {
                        if (!field.isAccessible()) {
                            field.setAccessible(true);
                        }
                        if (field.getType().isArray()) {
                            Object object = field.get(this);
                            if (object == null) {
                                stringBuilder.append("null");
                            } else {
                                int n = Array.getLength(object);
                                stringBuilder.append('[');
                                for (int k = 0; k < n; ++k) {
                                    stringBuilder.append(Array.get(object, k));
                                    if (k >= n - 1) continue;
                                    stringBuilder.append(", ");
                                }
                                stringBuilder.append(']');
                            }
                        } else {
                            stringBuilder.append(field.get(this));
                        }
                    }
                    catch (IllegalAccessException | SecurityException | InaccessibleObjectException exception) {
                        stringBuilder.append('?');
                    }
                    stringBuilder.append(", ");
                }
            } while ((clazz2 = clazz2.getSuperclass()) != null && clazz2 != clazz);
        }
        catch (Exception exception) {
            A.error((Object)("Error while doing toString on message " + this.getClass().getSimpleName()), (Throwable)exception);
            stringBuilder.append("ERROR");
        }
        stringBuilder.append("handler=").append(this.l()).append('}');
        return stringBuilder.toString();
    }
}


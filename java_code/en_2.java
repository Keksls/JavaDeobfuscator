/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 */
import com.google.common.base.Preconditions;
import java.io.EOFException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/*
 * Renamed from En
 */
public final class en_2 {
    private static final String a = "#optimized";

    private en_2() {
    }

    public static void a(ff_1 ff_12, byte n, eg_1 eg_12) {
        Serializable serializable;
        Object object;
        if (n == 0) {
            return;
        }
        String[] stringArray = new String[n];
        try {
            String string = eg_12.e();
            if (string.equals(a)) {
                int n2 = (n - 1) / 2;
                String[] stringArray2 = new String[n2];
                for (int k = 0; k < n2; ++k) {
                    stringArray2[k] = eg_12.e();
                }
                ff_12.a(stringArray2);
                ff_12.a(eg_12.a(n2));
                return;
            }
            stringArray[0] = string;
            for (int k = 1; k < n; ++k) {
                stringArray[k] = eg_12.e();
            }
        }
        catch (EOFException eOFException) {
            throw new RuntimeException("Unable to load " + ff_12.b(), eOFException);
        }
        int n3 = 0;
        AtomicLong atomicLong = new AtomicLong();
        AtomicLong atomicLong2 = new AtomicLong();
        HashMap<Object, Serializable> hashMap = new HashMap<Object, Serializable>();
        while (n3 < stringArray.length) {
            object = stringArray[n3++];
            if (n3 >= stringArray.length) {
                hashMap.put(object, null);
                atomicLong2.incrementAndGet();
                continue;
            }
            try {
                serializable = Byte.valueOf(Byte.parseByte(stringArray[n3].trim()));
                hashMap.put(object, serializable);
                atomicLong.addAndGet(((Byte)serializable).byteValue());
                ++n3;
            }
            catch (NumberFormatException numberFormatException) {
                hashMap.put(object, null);
                atomicLong2.incrementAndGet();
            }
        }
        object = new ArrayList();
        serializable = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            String string = (String)entry.getKey();
            Byte by = (Byte)entry.getValue();
            ((ArrayList)object).add(string);
            if (by != null) {
                ((ArrayList)serializable).add(by);
                continue;
            }
            byte by2 = (byte)Math.round((100.0f - atomicLong.floatValue()) / (float)atomicLong2.getAndDecrement());
            atomicLong.addAndGet(by2);
            ((ArrayList)serializable).add(by2);
        }
        Preconditions.checkState((atomicLong.get() <= 100L ? 1 : 0) != 0, (Object)"GoToRandomAnimation : Total percentage is greater than 100");
        ff_12.a(((ArrayList)object).toArray(new String[((ArrayList)object).size()]));
        ff_12.a(Cg.a(((ArrayList)serializable).toArray(new Byte[((ArrayList)serializable).size()])));
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class fiT {
    public static final int a = -1;

    public static int a(int n, @Nullable fiO fiO2, @NotNull epq_2 epq_22) {
        Iterable<? extends fio_0> iterable = epq_22.Y_();
        if (iterable == null) {
            return -1;
        }
        Iterator<? extends fio_0> iterator = iterable.iterator();
        fio_0 fio_02 = null;
        while (iterator.hasNext()) {
            fio_0 fio_03 = iterator.next();
            if (fio_03.aT_() != n) continue;
            fio_02 = fio_03;
        }
        if (fio_02 == null) {
            return -1;
        }
        if (fiO2 == null) {
            return fio_02.c();
        }
        if (fiO2.c()) {
            return fio_02.c();
        }
        return Math.min(fio_02.c(), fiO2.b());
    }
}


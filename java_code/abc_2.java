/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.procedure.TObjectProcedure;
import java.lang.reflect.Array;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aBC
 */
public class abc_2<T>
implements Iterable<T> {
    private T[] a;

    public abc_2() {
        this.a = (Object[])Array.newInstance(Object.class, 0);
    }

    public abc_2(T[] TArray) {
        this.a = (Object[])TArray.clone();
    }

    public void a(T t) {
        if (t == null) {
            return;
        }
        int n = this.a.length;
        Object[] objectArray = (Object[])Array.newInstance(Object.class, n + 1);
        System.arraycopy(this.a, 0, objectArray, 0, n);
        objectArray[n] = t;
        this.a = objectArray;
    }

    public void a(T[] TArray) {
        if (TArray == null || TArray.length == 0) {
            return;
        }
        int n = this.a.length;
        Object[] objectArray = (Object[])Array.newInstance(Object.class, n + TArray.length);
        if (n > 0) {
            System.arraycopy(this.a, 0, objectArray, 0, n);
        }
        System.arraycopy(TArray, 0, objectArray, n, TArray.length);
        this.a = objectArray;
    }

    public void b(T[] TArray) {
        if (TArray == null) {
            this.a = (Object[])Array.newInstance(Object.class, 0);
            return;
        }
        this.a = TArray;
    }

    public void a(int n, T t) {
        if (n < 0) {
            return;
        }
        if (n >= this.a.length) {
            Object[] objectArray = (Object[])Array.newInstance(Object.class, n + 1);
            System.arraycopy(this.a, 0, objectArray, 0, this.a.length);
            this.a = objectArray;
        }
        this.a[n] = t;
    }

    public T a(int n) {
        if (n < 0 || n >= this.a.length) {
            return null;
        }
        return this.a[n];
    }

    public int a() {
        return this.a.length;
    }

    public void b() {
        this.a = (Object[])Array.newInstance(Object.class, 0);
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return new aby_1<T>(this.a, false);
    }

    public void a(TObjectProcedure<T> tObjectProcedure) {
        for (int k = 0; k < this.a.length; ++k) {
            if (tObjectProcedure.execute(this.a[k])) continue;
            return;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from aJp
 */
public class ajp_1 {
    public static byte[] a(Object object) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ajp_1.a(object, (OutputStream)byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            throw new InternalError(iOException.toString());
        }
    }

    public static void a(Object object, OutputStream outputStream) {
        if (object instanceof String) {
            ajp_1.a((String)object, outputStream);
        } else if (object instanceof byte[]) {
            ajp_1.a((byte[])object, outputStream);
        } else if (object instanceof Number) {
            ajp_1.a((Number)object, outputStream);
        } else if (object instanceof List) {
            ajp_1.a((List)object, outputStream);
        } else if (object instanceof Map) {
            ajp_1.a((Map)object, outputStream);
        } else {
            throw new IllegalArgumentException("Cannot bencode: " + object.getClass());
        }
    }

    public static byte[] a(String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ajp_1.a(string, (OutputStream)byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            throw new InternalError(iOException.toString());
        }
    }

    public static void a(String string, OutputStream outputStream) {
        byte[] byArray = string.getBytes("UTF-8");
        ajp_1.a(byArray, outputStream);
    }

    public static byte[] a(Number number) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ajp_1.a(number, (OutputStream)byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            throw new InternalError(iOException.toString());
        }
    }

    public static void a(Number number, OutputStream outputStream) {
        outputStream.write(105);
        String string = number.toString();
        outputStream.write(string.getBytes("UTF-8"));
        outputStream.write(101);
    }

    public static byte[] a(List list) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ajp_1.a(list, (OutputStream)byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            throw new InternalError(iOException.toString());
        }
    }

    public static void a(List list, OutputStream outputStream) {
        outputStream.write(108);
        for (Object e2 : list) {
            ajp_1.a(e2, outputStream);
        }
        outputStream.write(101);
    }

    public static byte[] a(byte[] byArray) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ajp_1.a(byArray, (OutputStream)byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            throw new InternalError(iOException.toString());
        }
    }

    public static void a(byte[] byArray, OutputStream outputStream) {
        String string = Integer.toString(byArray.length);
        outputStream.write(string.getBytes("UTF-8"));
        outputStream.write(58);
        outputStream.write(byArray);
    }

    public static byte[] a(Map<String, Object> map) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ajp_1.a(map, (OutputStream)byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            throw new InternalError(iOException.toString());
        }
    }

    public static void a(Map<String, Object> map, OutputStream outputStream) {
        outputStream.write(100);
        Set<String> set = map.keySet();
        ArrayList<String> arrayList = new ArrayList<String>(set);
        Collections.sort(arrayList);
        for (String string : arrayList) {
            Object object = map.get(string);
            ajp_1.a(string, outputStream);
            ajp_1.a(object, outputStream);
        }
        outputStream.write(101);
    }
}


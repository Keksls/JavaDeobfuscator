/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Bytes
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.primitives.Bytes;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aZM
 */
public final class azm_0 {
    private static final Logger a = Logger.getLogger(azm_0.class);
    private static final Function<Byte, String> b = by -> String.format("%02X", by);
    private static final Collector<CharSequence, ?, String> c = Collectors.joining(":");
    @Nullable
    private static String d;
    @Nullable
    private static String e;

    private azm_0() {
    }

    public static Optional<String> a() {
        Optional<String> optional = azm_0.b();
        Optional<String> optional2 = azm_0.c();
        if (optional.isEmpty() && optional2.isEmpty()) {
            return Optional.empty();
        }
        StringBuilder stringBuilder = new StringBuilder();
        optional.ifPresent(stringBuilder::append);
        if (optional.isPresent() && optional2.isPresent()) {
            stringBuilder.append('@');
        }
        optional2.ifPresent(stringBuilder::append);
        String string = stringBuilder.toString();
        return Optional.of(string);
    }

    public static Optional<String> b() {
        if (d != null) {
            return Optional.of(d);
        }
        try {
            String string;
            d = string = InetAddress.getLocalHost().getHostName();
            return Optional.of(string);
        }
        catch (UnknownHostException unknownHostException) {
            a.warn((Object)"Unable to get host name", (Throwable)unknownHostException);
            return Optional.empty();
        }
    }

    public static Optional<String> c() {
        Optional<String> optional = azm_0.d();
        if (optional.isPresent()) {
            return optional;
        }
        Optional<String> optional2 = azm_0.a(true);
        if (optional2.isPresent()) {
            return optional2;
        }
        return azm_0.a(false);
    }

    private static Optional<String> d() {
        if (e != null) {
            return Optional.of(e);
        }
        try {
            String string;
            InetAddress inetAddress = InetAddress.getLocalHost();
            if (inetAddress == null) {
                return Optional.empty();
            }
            NetworkInterface networkInterface = NetworkInterface.getByInetAddress(inetAddress);
            if (networkInterface == null) {
                return Optional.empty();
            }
            if (!networkInterface.isUp()) {
                return Optional.empty();
            }
            if (networkInterface.isVirtual()) {
                return Optional.empty();
            }
            if (networkInterface.isLoopback()) {
                return Optional.empty();
            }
            boolean bl = azm_0.a(networkInterface);
            if (bl) {
                return Optional.empty();
            }
            byte[] byArray = networkInterface.getHardwareAddress();
            if (byArray == null || byArray.length == 0) {
                return Optional.empty();
            }
            e = string = Bytes.asList((byte[])byArray).stream().map(b).collect(c);
            return Optional.of(string);
        }
        catch (IOException iOException) {
            a.warn((Object)"Unable to get hardware address", (Throwable)iOException);
            return Optional.empty();
        }
    }

    private static boolean a(NetworkInterface networkInterface) {
        String string = networkInterface.getDisplayName();
        if (string != null && string.toLowerCase().contains("virtu")) {
            return true;
        }
        String string2 = networkInterface.getName();
        return string2 != null && string2.toLowerCase().contains("virtu");
    }

    private static Optional<String> a(boolean bl) {
        if (e != null) {
            return Optional.of(e);
        }
        try {
            Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
            while (enumeration.hasMoreElements()) {
                Optional<String> optional;
                NetworkInterface networkInterface = enumeration.nextElement();
                if (!networkInterface.isUp() || bl && (networkInterface.isVirtual() || azm_0.a(networkInterface)) || networkInterface.isLoopback() || (optional = azm_0.b(networkInterface)).isEmpty()) continue;
                return optional;
            }
        }
        catch (IOException iOException) {
            a.warn((Object)"Unable to get hardware address", (Throwable)iOException);
        }
        return Optional.empty();
    }

    private static Optional<String> b(NetworkInterface networkInterface) {
        if (e != null) {
            return Optional.of(e);
        }
        try {
            Enumeration<InetAddress> enumeration = networkInterface.getInetAddresses();
            while (enumeration.hasMoreElements()) {
                String string;
                byte[] byArray;
                String string2 = enumeration.nextElement().getHostAddress();
                if (!InetAddress.getByName(string2).isReachable(100) || (byArray = networkInterface.getHardwareAddress()) == null || byArray.length == 0) continue;
                e = string = Bytes.asList((byte[])byArray).stream().map(b).collect(c);
                return Optional.of(string);
            }
        }
        catch (IOException iOException) {
            a.warn((Object)"Unable to get hardware address", (Throwable)iOException);
        }
        return Optional.empty();
    }
}


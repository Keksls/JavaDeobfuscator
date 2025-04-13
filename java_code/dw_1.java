/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapEntry
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/*
 * Renamed from dw
 */
public final class dw_1
extends GeneratedMessageV3
implements db_1 {
    private static final long f = 0L;
    int g;
    public static final int a = 1;
    MapField<Integer, dv_2> h;
    public static final int b = 2;
    MapField<Integer, Integer> i;
    public static final int c = 3;
    boolean j;
    public static final int d = 4;
    boolean k;
    private byte l = (byte)-1;
    private static final dw_1 m = new dw_1();
    @Deprecated
    public static final Parser<dw_1> e = new dx_1();

    dw_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private dw_1() {
        this.j = false;
        this.k = false;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    dw_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block13;
                        bl = true;
                        continue block13;
                    }
                    case 10: {
                        if (!(n & true)) {
                            this.h = MapField.newMapField(da_1.a);
                            n |= 1;
                        }
                        MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(da_1.a.getParserForType(), extensionRegistryLite);
                        this.h.getMutableMap().put((Integer)mapEntry.getKey(), (dv_2)mapEntry.getValue());
                        continue block13;
                    }
                    case 18: {
                        if ((n & 2) != 2) {
                            this.i = MapField.newMapField(dz_2.a);
                            n |= 2;
                        }
                        MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(dz_2.a.getParserForType(), extensionRegistryLite);
                        this.i.getMutableMap().put((Integer)mapEntry.getKey(), (Integer)mapEntry.getValue());
                        continue block13;
                    }
                    case 24: {
                        this.g |= 1;
                        this.j = codedInputStream.readBool();
                        continue block13;
                    }
                    case 32: 
                }
                this.g |= 2;
                this.k = codedInputStream.readBool();
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return dn_1.q;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.s();
            }
            case 2: {
                return this.t();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dn_1.r.ensureFieldAccessorsInitialized(dw_1.class, dy_1.class);
    }

    MapField<Integer, dv_2> s() {
        if (this.h == null) {
            return MapField.emptyMapField(da_1.a);
        }
        return this.h;
    }

    @Override
    public int b() {
        return this.s().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.s().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, dv_2> c() {
        return this.d();
    }

    @Override
    public Map<Integer, dv_2> d() {
        return this.s().getMap();
    }

    @Override
    public dv_2 a(int n, dv_2 dv_22) {
        Map map = this.s().getMap();
        return map.containsKey(n) ? (dv_2)map.get(n) : dv_22;
    }

    @Override
    public dv_2 b(int n) {
        Map map = this.s().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (dv_2)map.get(n);
    }

    MapField<Integer, Integer> t() {
        if (this.i == null) {
            return MapField.emptyMapField(dz_2.a);
        }
        return this.i;
    }

    @Override
    public int e() {
        return this.t().getMap().size();
    }

    @Override
    public boolean c(int n) {
        return this.t().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, Integer> f() {
        return this.g();
    }

    @Override
    public Map<Integer, Integer> g() {
        return this.t().getMap();
    }

    @Override
    public int a(int n, int n2) {
        Map map = this.t().getMap();
        return map.containsKey(n) ? (Integer)map.get(n) : n2;
    }

    @Override
    public int d(int n) {
        Map map = this.t().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (Integer)map.get(n);
    }

    @Override
    public boolean h() {
        return (this.g & 1) == 1;
    }

    @Override
    public boolean i() {
        return this.j;
    }

    @Override
    public boolean j() {
        return (this.g & 2) == 2;
    }

    @Override
    public boolean k() {
        return this.k;
    }

    public final boolean isInitialized() {
        byte by = this.l;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.h()) {
            this.l = 0;
            return false;
        }
        for (dv_2 dv_22 : this.d().values()) {
            if (dv_22.isInitialized()) continue;
            this.l = 0;
            return false;
        }
        this.l = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.s(), da_1.a, (int)1);
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.t(), dz_2.a, (int)2);
        if ((this.g & 1) == 1) {
            codedOutputStream.writeBool(3, this.j);
        }
        if ((this.g & 2) == 2) {
            codedOutputStream.writeBool(4, this.k);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        MapEntry mapEntry;
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (Map.Entry entry : this.s().getMap().entrySet()) {
            mapEntry = da_1.a.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((dv_2)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)mapEntry);
        }
        for (Map.Entry entry : this.t().getMap().entrySet()) {
            mapEntry = dz_2.a.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((Integer)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)mapEntry);
        }
        if ((this.g & 1) == 1) {
            n += CodedOutputStream.computeBoolSize((int)3, (boolean)this.j);
        }
        if ((this.g & 2) == 2) {
            n += CodedOutputStream.computeBoolSize((int)4, (boolean)this.k);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dw_1)) {
            return super.equals(object);
        }
        dw_1 dw_12 = (dw_1)object;
        boolean bl = true;
        bl = bl && this.s().equals(dw_12.s());
        bl = bl && this.t().equals(dw_12.t());
        boolean bl2 = bl = bl && this.h() == dw_12.h();
        if (this.h()) {
            bl = bl && this.i() == dw_12.i();
        }
        boolean bl3 = bl = bl && this.j() == dw_12.j();
        if (this.j()) {
            bl = bl && this.k() == dw_12.k();
        }
        bl = bl && this.unknownFields.equals((Object)dw_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + dw_1.a().hashCode();
        if (!this.s().getMap().isEmpty()) {
            n = 37 * n + 1;
            n = 53 * n + this.s().hashCode();
        }
        if (!this.t().getMap().isEmpty()) {
            n = 37 * n + 2;
            n = 53 * n + this.t().hashCode();
        }
        if (this.h()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashBoolean((boolean)this.i());
        }
        if (this.j()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashBoolean((boolean)this.k());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static dw_1 a(ByteBuffer byteBuffer) {
        return (dw_1)e.parseFrom(byteBuffer);
    }

    public static dw_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (dw_1)e.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static dw_1 a(ByteString byteString) {
        return (dw_1)e.parseFrom(byteString);
    }

    public static dw_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (dw_1)e.parseFrom(byteString, extensionRegistryLite);
    }

    public static dw_1 a(byte[] byArray) {
        return (dw_1)e.parseFrom(byArray);
    }

    public static dw_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (dw_1)e.parseFrom(byArray, extensionRegistryLite);
    }

    public static dw_1 a(InputStream inputStream) {
        return (dw_1)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream);
    }

    public static dw_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dw_1)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dw_1 b(InputStream inputStream) {
        return (dw_1)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream);
    }

    public static dw_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dw_1)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dw_1 a(CodedInputStream codedInputStream) {
        return (dw_1)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream);
    }

    public static dw_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dw_1)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public dy_1 l() {
        return dw_1.m();
    }

    public static dy_1 m() {
        return m.n();
    }

    public static dy_1 a(dw_1 dw_12) {
        return m.n().a(dw_12);
    }

    public dy_1 n() {
        return this == m ? new dy_1() : new dy_1().a(this);
    }

    protected dy_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        dy_1 dy_12 = new dy_1(builderParent);
        return dy_12;
    }

    public static dw_1 o() {
        return m;
    }

    public static Parser<dw_1> p() {
        return e;
    }

    public Parser<dw_1> getParserForType() {
        return e;
    }

    public dw_1 q() {
        return m;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.n();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.l();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.q();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.q();
    }

    static /* synthetic */ boolean r() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(dw_1 dw_12) {
        return dw_12.unknownFields;
    }
}


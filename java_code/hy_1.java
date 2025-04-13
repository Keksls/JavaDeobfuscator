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
 * Renamed from hy
 */
public final class hy_1
extends GeneratedMessageV3
implements hC {
    private static final long f = 0L;
    int g;
    public static final int a = 1;
    int h;
    public static final int b = 2;
    int i;
    public static final int c = 3;
    int j;
    public static final int d = 4;
    MapField<Integer, hD> k;
    private byte l = (byte)-1;
    private static final hy_1 m = new hy_1();
    @Deprecated
    public static final Parser<hy_1> e = new hz_1();

    hy_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private hy_1() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    hy_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 8: {
                        this.g |= 1;
                        this.h = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 16: {
                        this.g |= 2;
                        this.i = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 24: {
                        this.g |= 4;
                        this.j = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 34: 
                }
                if ((n & 8) != 8) {
                    this.k = MapField.newMapField(hb_0.a);
                    n |= 8;
                }
                MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(hb_0.a.getParserForType(), extensionRegistryLite);
                this.k.getMutableMap().put((Integer)mapEntry.getKey(), (hD)mapEntry.getValue());
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
        return hl_0.i;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 4: {
                return this.r();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hl_0.j.ensureFieldAccessorsInitialized(hy_1.class, hA.class);
    }

    @Override
    public boolean b() {
        return (this.g & 1) == 1;
    }

    @Override
    public int c() {
        return this.h;
    }

    @Override
    public boolean d() {
        return (this.g & 2) == 2;
    }

    @Override
    public int e() {
        return this.i;
    }

    @Override
    public boolean f() {
        return (this.g & 4) == 4;
    }

    @Override
    public int g() {
        return this.j;
    }

    MapField<Integer, hD> r() {
        if (this.k == null) {
            return MapField.emptyMapField(hb_0.a);
        }
        return this.k;
    }

    @Override
    public int h() {
        return this.r().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.r().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, hD> i() {
        return this.j();
    }

    @Override
    public Map<Integer, hD> j() {
        return this.r().getMap();
    }

    @Override
    public hD a(int n, hD hD2) {
        Map map = this.r().getMap();
        return map.containsKey(n) ? (hD)map.get(n) : hD2;
    }

    @Override
    public hD b(int n) {
        Map map = this.r().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (hD)map.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.l;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.l = 0;
            return false;
        }
        if (!this.d()) {
            this.l = 0;
            return false;
        }
        for (hD hD2 : this.j().values()) {
            if (hD2.isInitialized()) continue;
            this.l = 0;
            return false;
        }
        this.l = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.g & 1) == 1) {
            codedOutputStream.writeInt32(1, this.h);
        }
        if ((this.g & 2) == 2) {
            codedOutputStream.writeInt32(2, this.i);
        }
        if ((this.g & 4) == 4) {
            codedOutputStream.writeInt32(3, this.j);
        }
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.r(), hb_0.a, (int)4);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.g & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.h);
        }
        if ((this.g & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.i);
        }
        if ((this.g & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.j);
        }
        for (Map.Entry entry : this.r().getMap().entrySet()) {
            MapEntry mapEntry = hb_0.a.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((hD)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)4, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof hy_1)) {
            return super.equals(object);
        }
        hy_1 hy_12 = (hy_1)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == hy_12.b();
        if (this.b()) {
            bl = bl && this.c() == hy_12.c();
        }
        boolean bl3 = bl = bl && this.d() == hy_12.d();
        if (this.d()) {
            bl = bl && this.e() == hy_12.e();
        }
        boolean bl4 = bl = bl && this.f() == hy_12.f();
        if (this.f()) {
            bl = bl && this.g() == hy_12.g();
        }
        bl = bl && this.r().equals(hy_12.r());
        bl = bl && this.unknownFields.equals((Object)hy_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + hy_1.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e();
        }
        if (this.f()) {
            n = 37 * n + 3;
            n = 53 * n + this.g();
        }
        if (!this.r().getMap().isEmpty()) {
            n = 37 * n + 4;
            n = 53 * n + this.r().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static hy_1 a(ByteBuffer byteBuffer) {
        return (hy_1)e.parseFrom(byteBuffer);
    }

    public static hy_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (hy_1)e.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static hy_1 a(ByteString byteString) {
        return (hy_1)e.parseFrom(byteString);
    }

    public static hy_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (hy_1)e.parseFrom(byteString, extensionRegistryLite);
    }

    public static hy_1 a(byte[] byArray) {
        return (hy_1)e.parseFrom(byArray);
    }

    public static hy_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (hy_1)e.parseFrom(byArray, extensionRegistryLite);
    }

    public static hy_1 a(InputStream inputStream) {
        return (hy_1)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream);
    }

    public static hy_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hy_1)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hy_1 b(InputStream inputStream) {
        return (hy_1)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream);
    }

    public static hy_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hy_1)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hy_1 a(CodedInputStream codedInputStream) {
        return (hy_1)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream);
    }

    public static hy_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hy_1)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public hA k() {
        return hy_1.l();
    }

    public static hA l() {
        return m.m();
    }

    public static hA a(hy_1 hy_12) {
        return m.m().a(hy_12);
    }

    public hA m() {
        return this == m ? new hA() : new hA().a(this);
    }

    protected hA a(GeneratedMessageV3.BuilderParent builderParent) {
        hA hA2 = new hA(builderParent);
        return hA2;
    }

    public static hy_1 n() {
        return m;
    }

    public static Parser<hy_1> o() {
        return e;
    }

    public Parser<hy_1> getParserForType() {
        return e;
    }

    public hy_1 p() {
        return m;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.m();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.k();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.p();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.p();
    }

    static /* synthetic */ boolean q() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(hy_1 hy_12) {
        return hy_12.unknownFields;
    }
}


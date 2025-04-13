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
 * Renamed from hn
 */
public final class hn_0
extends GeneratedMessageV3
implements hv_0 {
    private static final long c = 0L;
    public static final int a = 1;
    MapField<Long, hr_0> d;
    private byte e = (byte)-1;
    private static final hn_0 f = new hn_0();
    @Deprecated
    public static final Parser<hn_0> b = new ho_0();

    hn_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private hn_0() {
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    hn_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block10: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block10;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block10;
                        bl2 = true;
                        continue block10;
                    }
                    case 10: 
                }
                if (!(bl & true)) {
                    this.d = MapField.newMapField(hq_0.a);
                    bl |= true;
                }
                MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(hq_0.a.getParserForType(), extensionRegistryLite);
                this.d.getMutableMap().put((Long)mapEntry.getKey(), (hr_0)mapEntry.getValue());
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
        return hl_0.c;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.l();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hl_0.d.ensureFieldAccessorsInitialized(hn_0.class, hp_0.class);
    }

    MapField<Long, hr_0> l() {
        if (this.d == null) {
            return MapField.emptyMapField(hq_0.a);
        }
        return this.d;
    }

    @Override
    public int b() {
        return this.l().getMap().size();
    }

    @Override
    public boolean a(long l) {
        return this.l().getMap().containsKey(l);
    }

    @Override
    @Deprecated
    public Map<Long, hr_0> c() {
        return this.d();
    }

    @Override
    public Map<Long, hr_0> d() {
        return this.l().getMap();
    }

    @Override
    public hr_0 a(long l, hr_0 hr_02) {
        Map map = this.l().getMap();
        return map.containsKey(l) ? (hr_0)map.get(l) : hr_02;
    }

    @Override
    public hr_0 b(long l) {
        Map map = this.l().getMap();
        if (!map.containsKey(l)) {
            throw new IllegalArgumentException();
        }
        return (hr_0)map.get(l);
    }

    public final boolean isInitialized() {
        byte by = this.e;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (hr_0 hr_02 : this.d().values()) {
            if (hr_02.isInitialized()) continue;
            this.e = 0;
            return false;
        }
        this.e = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        GeneratedMessageV3.serializeLongMapTo((CodedOutputStream)codedOutputStream, this.l(), hq_0.a, (int)1);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (Map.Entry entry : this.l().getMap().entrySet()) {
            MapEntry mapEntry = hq_0.a.newBuilderForType().setKey((Object)((Long)entry.getKey())).setValue((Object)((hr_0)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof hn_0)) {
            return super.equals(object);
        }
        hn_0 hn_02 = (hn_0)object;
        boolean bl = true;
        bl = bl && this.l().equals(hn_02.l());
        bl = bl && this.unknownFields.equals((Object)hn_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + hn_0.a().hashCode();
        if (!this.l().getMap().isEmpty()) {
            n = 37 * n + 1;
            n = 53 * n + this.l().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static hn_0 a(ByteBuffer byteBuffer) {
        return (hn_0)b.parseFrom(byteBuffer);
    }

    public static hn_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (hn_0)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static hn_0 a(ByteString byteString) {
        return (hn_0)b.parseFrom(byteString);
    }

    public static hn_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (hn_0)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static hn_0 a(byte[] byArray) {
        return (hn_0)b.parseFrom(byArray);
    }

    public static hn_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (hn_0)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static hn_0 a(InputStream inputStream) {
        return (hn_0)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static hn_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hn_0)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hn_0 b(InputStream inputStream) {
        return (hn_0)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static hn_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hn_0)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hn_0 a(CodedInputStream codedInputStream) {
        return (hn_0)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static hn_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hn_0)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public hp_0 e() {
        return hn_0.f();
    }

    public static hp_0 f() {
        return f.g();
    }

    public static hp_0 a(hn_0 hn_02) {
        return f.g().a(hn_02);
    }

    public hp_0 g() {
        return this == f ? new hp_0() : new hp_0().a(this);
    }

    protected hp_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        hp_0 hp_02 = new hp_0(builderParent);
        return hp_02;
    }

    public static hn_0 h() {
        return f;
    }

    public static Parser<hn_0> i() {
        return b;
    }

    public Parser<hn_0> getParserForType() {
        return b;
    }

    public hn_0 j() {
        return f;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.j();
    }

    static /* synthetic */ boolean k() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(hn_0 hn_02) {
        return hn_02.unknownFields;
    }
}


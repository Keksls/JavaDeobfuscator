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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from aY
 */
public final class ay_1
extends GeneratedMessageV3
implements bb_2 {
    private static final long c = 0L;
    public static final int a = 1;
    long d;
    public static final int b = 2;
    long e;
    private byte f = (byte)-1;
    private static final ay_1 g = new ay_1();
    static final Parser<ay_1> h = new az_2();

    ay_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ay_1() {
        this.d = 0L;
        this.e = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ay_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 8: {
                        this.d = codedInputStream.readInt64();
                        continue block11;
                    }
                    case 16: 
                }
                this.e = codedInputStream.readInt64();
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
        return ak_2.k;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.l.ensureFieldAccessorsInitialized(ay_1.class, ba_1.class);
    }

    @Override
    public long b() {
        return this.d;
    }

    @Override
    public long c() {
        return this.e;
    }

    public final boolean isInitialized() {
        byte by = this.f;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.f = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.d != 0L) {
            codedOutputStream.writeInt64(1, this.d);
        }
        if (this.e != 0L) {
            codedOutputStream.writeInt64(2, this.e);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.d != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.d);
        }
        if (this.e != 0L) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.e);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ay_1)) {
            return super.equals(object);
        }
        ay_1 ay_12 = (ay_1)object;
        boolean bl = true;
        bl = bl && this.b() == ay_12.b();
        bl = bl && this.c() == ay_12.c();
        bl = bl && this.unknownFields.equals((Object)ay_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ay_1.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.b());
        n = 37 * n + 2;
        n = 53 * n + Internal.hashLong((long)this.c());
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ay_1 a(ByteBuffer byteBuffer) {
        return (ay_1)h.parseFrom(byteBuffer);
    }

    public static ay_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ay_1)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ay_1 a(ByteString byteString) {
        return (ay_1)h.parseFrom(byteString);
    }

    public static ay_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ay_1)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static ay_1 a(byte[] byArray) {
        return (ay_1)h.parseFrom(byArray);
    }

    public static ay_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ay_1)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static ay_1 a(InputStream inputStream) {
        return (ay_1)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static ay_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ay_1)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ay_1 b(InputStream inputStream) {
        return (ay_1)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static ay_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ay_1)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ay_1 a(CodedInputStream codedInputStream) {
        return (ay_1)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static ay_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ay_1)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ba_1 d() {
        return ay_1.e();
    }

    public static ba_1 e() {
        return g.f();
    }

    public static ba_1 a(ay_1 ay_12) {
        return g.f().a(ay_12);
    }

    public ba_1 f() {
        return this == g ? new ba_1() : new ba_1().a(this);
    }

    protected ba_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        ba_1 ba_12 = new ba_1(builderParent);
        return ba_12;
    }

    public static ay_1 g() {
        return g;
    }

    public static Parser<ay_1> h() {
        return h;
    }

    public Parser<ay_1> getParserForType() {
        return h;
    }

    public ay_1 i() {
        return g;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.f();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.d();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.d();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.i();
    }

    static /* synthetic */ boolean j() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ay_1 ay_12) {
        return ay_12.unknownFields;
    }
}


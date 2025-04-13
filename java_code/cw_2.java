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
 * Renamed from cw
 */
public final class cw_2
extends GeneratedMessageV3
implements cz_2 {
    private static final long c = 0L;
    public static final int a = 1;
    long d;
    public static final int b = 2;
    long e;
    private byte f = (byte)-1;
    private static final cw_2 g = new cw_2();
    static final Parser<cw_2> h = new cx_2();

    cw_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private cw_2() {
        this.d = 0L;
        this.e = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    cw_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
        return ak_2.I;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.J.ensureFieldAccessorsInitialized(cw_2.class, cy_1.class);
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
        if (!(object instanceof cw_2)) {
            return super.equals(object);
        }
        cw_2 cw_22 = (cw_2)object;
        boolean bl = true;
        bl = bl && this.b() == cw_22.b();
        bl = bl && this.c() == cw_22.c();
        bl = bl && this.unknownFields.equals((Object)cw_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + cw_2.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.b());
        n = 37 * n + 2;
        n = 53 * n + Internal.hashLong((long)this.c());
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static cw_2 a(ByteBuffer byteBuffer) {
        return (cw_2)h.parseFrom(byteBuffer);
    }

    public static cw_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (cw_2)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static cw_2 a(ByteString byteString) {
        return (cw_2)h.parseFrom(byteString);
    }

    public static cw_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (cw_2)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static cw_2 a(byte[] byArray) {
        return (cw_2)h.parseFrom(byArray);
    }

    public static cw_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (cw_2)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static cw_2 a(InputStream inputStream) {
        return (cw_2)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static cw_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cw_2)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cw_2 b(InputStream inputStream) {
        return (cw_2)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static cw_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cw_2)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cw_2 a(CodedInputStream codedInputStream) {
        return (cw_2)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static cw_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cw_2)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public cy_1 d() {
        return cw_2.e();
    }

    public static cy_1 e() {
        return g.f();
    }

    public static cy_1 a(cw_2 cw_22) {
        return g.f().a(cw_22);
    }

    public cy_1 f() {
        return this == g ? new cy_1() : new cy_1().a(this);
    }

    protected cy_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        cy_1 cy_12 = new cy_1(builderParent);
        return cy_12;
    }

    public static cw_2 g() {
        return g;
    }

    public static Parser<cw_2> h() {
        return h;
    }

    public Parser<cw_2> getParserForType() {
        return h;
    }

    public cw_2 i() {
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

    static /* synthetic */ UnknownFieldSet b(cw_2 cw_22) {
        return cw_22.unknownFields;
    }
}


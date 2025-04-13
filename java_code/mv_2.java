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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from MV
 */
public final class mv_2
extends GeneratedMessageV3
implements my_2 {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    volatile Object g;
    public static final int b = 2;
    volatile Object h;
    public static final int c = 3;
    int i;
    private byte j = (byte)-1;
    private static final mv_2 k = new mv_2();
    @Deprecated
    public static final Parser<mv_2> d = new mw_2();

    mv_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mv_2() {
        this.g = "";
        this.h = "";
        this.i = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mv_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block12;
                        bl2 = true;
                        continue block12;
                    }
                    case 10: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.f |= 1;
                        this.g = byteString;
                        continue block12;
                    }
                    case 18: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.f |= 2;
                        this.h = byteString;
                        continue block12;
                    }
                    case 24: 
                }
                this.f |= 4;
                this.i = codedInputStream.readInt32();
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
        return mt_2.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mt_2.b.ensureFieldAccessorsInitialized(mv_2.class, mx_2.class);
    }

    @Override
    public boolean b() {
        return (this.f & 1) == 1;
    }

    @Override
    public String c() {
        Object object = this.g;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.g = string;
        }
        return string;
    }

    @Override
    public ByteString d() {
        Object object = this.g;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.g = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean e() {
        return (this.f & 2) == 2;
    }

    @Override
    public String f() {
        Object object = this.h;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.h = string;
        }
        return string;
    }

    @Override
    public ByteString g() {
        Object object = this.h;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.h = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean h() {
        return (this.f & 4) == 4;
    }

    @Override
    public int i() {
        return this.i;
    }

    public final boolean isInitialized() {
        byte by = this.j;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.j = 0;
            return false;
        }
        if (!this.e()) {
            this.j = 0;
            return false;
        }
        if (!this.h()) {
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.f & 1) == 1) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.g);
        }
        if ((this.f & 2) == 2) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.h);
        }
        if ((this.f & 4) == 4) {
            codedOutputStream.writeInt32(3, this.i);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.f & 1) == 1) {
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.g);
        }
        if ((this.f & 2) == 2) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.h);
        }
        if ((this.f & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.i);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mv_2)) {
            return super.equals(object);
        }
        mv_2 mv_22 = (mv_2)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == mv_22.b();
        if (this.b()) {
            bl = bl && this.c().equals(mv_22.c());
        }
        boolean bl3 = bl = bl && this.e() == mv_22.e();
        if (this.e()) {
            bl = bl && this.f().equals(mv_22.f());
        }
        boolean bl4 = bl = bl && this.h() == mv_22.h();
        if (this.h()) {
            bl = bl && this.i() == mv_22.i();
        }
        bl = bl && this.unknownFields.equals((Object)mv_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mv_2.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c().hashCode();
        }
        if (this.e()) {
            n = 37 * n + 2;
            n = 53 * n + this.f().hashCode();
        }
        if (this.h()) {
            n = 37 * n + 3;
            n = 53 * n + this.i();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mv_2 a(ByteBuffer byteBuffer) {
        return (mv_2)d.parseFrom(byteBuffer);
    }

    public static mv_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mv_2)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mv_2 a(ByteString byteString) {
        return (mv_2)d.parseFrom(byteString);
    }

    public static mv_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mv_2)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static mv_2 a(byte[] byArray) {
        return (mv_2)d.parseFrom(byArray);
    }

    public static mv_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mv_2)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static mv_2 a(InputStream inputStream) {
        return (mv_2)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static mv_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mv_2)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mv_2 b(InputStream inputStream) {
        return (mv_2)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static mv_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mv_2)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mv_2 a(CodedInputStream codedInputStream) {
        return (mv_2)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static mv_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mv_2)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mx_2 j() {
        return mv_2.k();
    }

    public static mx_2 k() {
        return k.l();
    }

    public static mx_2 a(mv_2 mv_22) {
        return k.l().a(mv_22);
    }

    public mx_2 l() {
        return this == k ? new mx_2() : new mx_2().a(this);
    }

    protected mx_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        mx_2 mx_22 = new mx_2(builderParent);
        return mx_22;
    }

    public static mv_2 m() {
        return k;
    }

    public static Parser<mv_2> n() {
        return d;
    }

    public Parser<mv_2> getParserForType() {
        return d;
    }

    public mv_2 o() {
        return k;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.o();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.o();
    }

    static /* synthetic */ boolean p() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mv_2 mv_22) {
        return mv_22.unknownFields;
    }
}


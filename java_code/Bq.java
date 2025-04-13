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

public final class Bq
extends GeneratedMessageV3
implements Bt {
    private static final long f = 0L;
    int g;
    public static final int a = 1;
    long h;
    public static final int b = 2;
    volatile Object i;
    public static final int c = 3;
    volatile Object j;
    public static final int d = 4;
    long k;
    private byte l = (byte)-1;
    private static final Bq m = new Bq();
    @Deprecated
    public static final Parser<Bq> e = new Br();

    Bq(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Bq() {
        this.h = 0L;
        this.i = "";
        this.j = "";
        this.k = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    Bq(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block13;
                        bl2 = true;
                        continue block13;
                    }
                    case 8: {
                        this.g |= 1;
                        this.h = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 18: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.g |= 2;
                        this.i = byteString;
                        continue block13;
                    }
                    case 26: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.g |= 4;
                        this.j = byteString;
                        continue block13;
                    }
                    case 32: 
                }
                this.g |= 8;
                this.k = codedInputStream.readInt64();
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
        return AO.i;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.j.ensureFieldAccessorsInitialized(Bq.class, Bs.class);
    }

    @Override
    public boolean b() {
        return (this.g & 1) == 1;
    }

    @Override
    public long c() {
        return this.h;
    }

    @Override
    public boolean d() {
        return (this.g & 2) == 2;
    }

    @Override
    public String e() {
        Object object = this.i;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.i = string;
        }
        return string;
    }

    @Override
    public ByteString f() {
        Object object = this.i;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.i = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean g() {
        return (this.g & 4) == 4;
    }

    @Override
    public String h() {
        Object object = this.j;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.j = string;
        }
        return string;
    }

    @Override
    public ByteString i() {
        Object object = this.j;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.j = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean j() {
        return (this.g & 8) == 8;
    }

    @Override
    public long k() {
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
        if (!this.b()) {
            this.l = 0;
            return false;
        }
        if (!this.d()) {
            this.l = 0;
            return false;
        }
        this.l = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.g & 1) == 1) {
            codedOutputStream.writeInt64(1, this.h);
        }
        if ((this.g & 2) == 2) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.i);
        }
        if ((this.g & 4) == 4) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.j);
        }
        if ((this.g & 8) == 8) {
            codedOutputStream.writeInt64(4, this.k);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.g & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.h);
        }
        if ((this.g & 2) == 2) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.i);
        }
        if ((this.g & 4) == 4) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.j);
        }
        if ((this.g & 8) == 8) {
            n += CodedOutputStream.computeInt64Size((int)4, (long)this.k);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Bq)) {
            return super.equals(object);
        }
        Bq bq = (Bq)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == bq.b();
        if (this.b()) {
            bl = bl && this.c() == bq.c();
        }
        boolean bl3 = bl = bl && this.d() == bq.d();
        if (this.d()) {
            bl = bl && this.e().equals(bq.e());
        }
        boolean bl4 = bl = bl && this.g() == bq.g();
        if (this.g()) {
            bl = bl && this.h().equals(bq.h());
        }
        boolean bl5 = bl = bl && this.j() == bq.j();
        if (this.j()) {
            bl = bl && this.k() == bq.k();
        }
        bl = bl && this.unknownFields.equals((Object)bq.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + Bq.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        if (this.g()) {
            n = 37 * n + 3;
            n = 53 * n + this.h().hashCode();
        }
        if (this.j()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashLong((long)this.k());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static Bq a(ByteBuffer byteBuffer) {
        return (Bq)e.parseFrom(byteBuffer);
    }

    public static Bq a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Bq)e.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Bq a(ByteString byteString) {
        return (Bq)e.parseFrom(byteString);
    }

    public static Bq a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Bq)e.parseFrom(byteString, extensionRegistryLite);
    }

    public static Bq a(byte[] byArray) {
        return (Bq)e.parseFrom(byArray);
    }

    public static Bq a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Bq)e.parseFrom(byArray, extensionRegistryLite);
    }

    public static Bq a(InputStream inputStream) {
        return (Bq)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream);
    }

    public static Bq a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Bq)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Bq b(InputStream inputStream) {
        return (Bq)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream);
    }

    public static Bq b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Bq)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Bq a(CodedInputStream codedInputStream) {
        return (Bq)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream);
    }

    public static Bq a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Bq)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public Bs l() {
        return Bq.m();
    }

    public static Bs m() {
        return m.n();
    }

    public static Bs a(Bq bq) {
        return m.n().a(bq);
    }

    public Bs n() {
        return this == m ? new Bs() : new Bs().a(this);
    }

    protected Bs a(GeneratedMessageV3.BuilderParent builderParent) {
        Bs bs = new Bs(builderParent);
        return bs;
    }

    public static Bq o() {
        return m;
    }

    public static Parser<Bq> p() {
        return e;
    }

    public Parser<Bq> getParserForType() {
        return e;
    }

    public Bq q() {
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

    static /* synthetic */ UnknownFieldSet b(Bq bq) {
        return bq.unknownFields;
    }
}


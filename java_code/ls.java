/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

public final class ls
extends GeneratedMessageV3.Builder<ls>
implements lx {
    private int a;
    private le_0 b = null;
    private SingleFieldBuilderV3<le_0, lg, lp> c;
    private int d;

    public static final Descriptors.Descriptor a() {
        return kM.C;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.D.ensureFieldAccessorsInitialized(lq_0.class, ls.class);
    }

    ls() {
        this.o();
    }

    ls(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.o();
    }

    private void o() {
        if (lq_0.m()) {
            this.p();
        }
    }

    public ls g() {
        super.clear();
        if (this.c == null) {
            this.b = null;
        } else {
            this.c.clear();
        }
        this.a &= 0xFFFFFFFE;
        this.d = 0;
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kM.C;
    }

    public lq_0 h() {
        return lq_0.j();
    }

    public lq_0 i() {
        lq_0 lq_02 = this.j();
        if (!lq_02.isInitialized()) {
            throw ls.newUninitializedMessageException((Message)lq_02);
        }
        return lq_02;
    }

    public lq_0 j() {
        lq_0 lq_02 = new lq_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        lq_02.f = this.c == null ? this.b : (le_0)this.c.build();
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        lq_02.g = this.d;
        lq_02.e = n2;
        this.onBuilt();
        return lq_02;
    }

    public ls k() {
        return (ls)super.clone();
    }

    public ls a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ls)super.setField(fieldDescriptor, object);
    }

    public ls a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ls)super.clearField(fieldDescriptor);
    }

    public ls a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ls)super.clearOneof(oneofDescriptor);
    }

    public ls a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ls)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ls b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ls)super.addRepeatedField(fieldDescriptor, object);
    }

    public ls a(Message message) {
        if (message instanceof lq_0) {
            return this.a((lq_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ls a(lq_0 lq_02) {
        if (lq_02 == lq_0.j()) {
            return this;
        }
        if (lq_02.b()) {
            this.b(lq_02.c());
        }
        if (lq_02.e()) {
            this.a(lq_02.f());
        }
        this.b(lq_0.b(lq_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.e()) {
            return false;
        }
        return this.c().isInitialized();
    }

    public ls a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        lq_0 lq_02 = null;
        try {
            lq_02 = (lq_0)lq_0.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lq_02 = (lq_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (lq_02 != null) {
                this.a(lq_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public le_0 c() {
        if (this.c == null) {
            return this.b == null ? le_0.H() : this.b;
        }
        return (le_0)this.c.getMessage();
    }

    public ls a(le_0 le_02) {
        if (this.c == null) {
            if (le_02 == null) {
                throw new NullPointerException();
            }
            this.b = le_02;
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)le_02);
        }
        this.a |= 1;
        return this;
    }

    public ls a(lg lg2) {
        if (this.c == null) {
            this.b = lg2.G();
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)lg2.G());
        }
        this.a |= 1;
        return this;
    }

    public ls b(le_0 le_02) {
        if (this.c == null) {
            this.b = (this.a & 1) == 1 && this.b != null && this.b != le_0.H() ? le_0.a(this.b).a(le_02).H() : le_02;
            this.onChanged();
        } else {
            this.c.mergeFrom((AbstractMessage)le_02);
        }
        this.a |= 1;
        return this;
    }

    public ls l() {
        if (this.c == null) {
            this.b = null;
            this.onChanged();
        } else {
            this.c.clear();
        }
        this.a &= 0xFFFFFFFE;
        return this;
    }

    public lg m() {
        this.a |= 1;
        this.onChanged();
        return (lg)this.p().getBuilder();
    }

    @Override
    public lp d() {
        if (this.c != null) {
            return (lp)this.c.getMessageOrBuilder();
        }
        return this.b == null ? le_0.H() : this.b;
    }

    private SingleFieldBuilderV3<le_0, lg, lp> p() {
        if (this.c == null) {
            this.c = new SingleFieldBuilderV3((AbstractMessage)this.c(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    @Override
    public boolean e() {
        return (this.a & 2) == 2;
    }

    @Override
    public int f() {
        return this.d;
    }

    public ls a(int n) {
        this.a |= 2;
        this.d = n;
        this.onChanged();
        return this;
    }

    public ls n() {
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.onChanged();
        return this;
    }

    public final ls a(UnknownFieldSet unknownFieldSet) {
        return (ls)super.setUnknownFields(unknownFieldSet);
    }

    public final ls b(UnknownFieldSet unknownFieldSet) {
        return (ls)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.g();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.k();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.g();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.k();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.k();
    }

    public /* synthetic */ Message buildPartial() {
        return this.j();
    }

    public /* synthetic */ Message build() {
        return this.i();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.j();
    }

    public /* synthetic */ MessageLite build() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ Object clone() {
        return this.k();
    }
}


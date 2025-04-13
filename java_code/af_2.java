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

/*
 * Renamed from af
 */
public final class af_2
extends GeneratedMessageV3.Builder<af_2>
implements ag_2 {
    private W a = null;
    private SingleFieldBuilderV3<W, Y, al_1> b;
    private int c = 0;

    public static final Descriptors.Descriptor a() {
        return e_0.i;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return e_0.j.ensureFieldAccessorsInitialized(ad_2.class, af_2.class);
    }

    af_2() {
        this.o();
    }

    af_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.o();
    }

    private void o() {
        if (ad_2.m()) {
            // empty if block
        }
    }

    public af_2 g() {
        super.clear();
        if (this.b == null) {
            this.a = null;
        } else {
            this.a = null;
            this.b = null;
        }
        this.c = 0;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return e_0.i;
    }

    public ad_2 h() {
        return ad_2.j();
    }

    public ad_2 i() {
        ad_2 ad_22 = this.j();
        if (!ad_22.isInitialized()) {
            throw af_2.newUninitializedMessageException((Message)ad_22);
        }
        return ad_22;
    }

    public ad_2 j() {
        ad_2 ad_22 = new ad_2(this);
        ad_22.d = this.b == null ? this.a : (W)this.b.build();
        ad_22.e = this.c;
        this.onBuilt();
        return ad_22;
    }

    public af_2 k() {
        return (af_2)super.clone();
    }

    public af_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (af_2)super.setField(fieldDescriptor, object);
    }

    public af_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (af_2)super.clearField(fieldDescriptor);
    }

    public af_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (af_2)super.clearOneof(oneofDescriptor);
    }

    public af_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (af_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public af_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (af_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public af_2 a(Message message) {
        if (message instanceof ad_2) {
            return this.a((ad_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public af_2 a(ad_2 ad_22) {
        if (ad_22 == ad_2.j()) {
            return this;
        }
        if (ad_22.b()) {
            this.b(ad_22.c());
        }
        if (ad_22.e != 0) {
            this.a(ad_22.e());
        }
        this.b(ad_2.b(ad_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public af_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ad_2 ad_22 = null;
        try {
            ad_22 = (ad_2)ad_2.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ad_22 = (ad_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ad_22 != null) {
                this.a(ad_22);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return this.b != null || this.a != null;
    }

    @Override
    public W c() {
        if (this.b == null) {
            return this.a == null ? W.k() : this.a;
        }
        return (W)this.b.getMessage();
    }

    public af_2 a(W w) {
        if (this.b == null) {
            if (w == null) {
                throw new NullPointerException();
            }
            this.a = w;
            this.onChanged();
        } else {
            this.b.setMessage((AbstractMessage)w);
        }
        return this;
    }

    public af_2 a(Y y) {
        if (this.b == null) {
            this.a = y.j();
            this.onChanged();
        } else {
            this.b.setMessage((AbstractMessage)y.j());
        }
        return this;
    }

    public af_2 b(W w) {
        if (this.b == null) {
            this.a = this.a != null ? W.a(this.a).a(w).k() : w;
            this.onChanged();
        } else {
            this.b.mergeFrom((AbstractMessage)w);
        }
        return this;
    }

    public af_2 l() {
        if (this.b == null) {
            this.a = null;
            this.onChanged();
        } else {
            this.a = null;
            this.b = null;
        }
        return this;
    }

    public Y m() {
        this.onChanged();
        return (Y)this.p().getBuilder();
    }

    @Override
    public al_1 d() {
        if (this.b != null) {
            return (al_1)this.b.getMessageOrBuilder();
        }
        return this.a == null ? W.k() : this.a;
    }

    private SingleFieldBuilderV3<W, Y, al_1> p() {
        if (this.b == null) {
            this.b = new SingleFieldBuilderV3((AbstractMessage)this.c(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.a = null;
        }
        return this.b;
    }

    @Override
    public int e() {
        return this.c;
    }

    public af_2 a(int n) {
        this.c = n;
        this.onChanged();
        return this;
    }

    @Override
    public T f() {
        T t = T.a(this.c);
        return t == null ? T.d : t;
    }

    public af_2 a(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        this.c = t.getNumber();
        this.onChanged();
        return this;
    }

    public af_2 n() {
        this.c = 0;
        this.onChanged();
        return this;
    }

    public final af_2 a(UnknownFieldSet unknownFieldSet) {
        return (af_2)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final af_2 b(UnknownFieldSet unknownFieldSet) {
        return (af_2)super.mergeUnknownFields(unknownFieldSet);
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


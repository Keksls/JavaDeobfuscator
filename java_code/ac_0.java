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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from AC
 */
public final class ac_0
extends GeneratedMessageV3.Builder<ac_0>
implements ad_0 {
    private int a;
    private List<ae_0> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<ae_0, ag_0, ah_0> c;

    public static final Descriptors.Descriptor a() {
        return aw_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return aw_0.b.ensureFieldAccessorsInitialized(aa_0.class, ac_0.class);
    }

    ac_0() {
        this.m();
    }

    ac_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (aa_0.k()) {
            this.o();
        }
    }

    public ac_0 e() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return aw_0.a;
    }

    public aa_0 f() {
        return aa_0.h();
    }

    public aa_0 g() {
        aa_0 aa_02 = this.h();
        if (!aa_02.isInitialized()) {
            throw ac_0.newUninitializedMessageException((Message)aa_02);
        }
        return aa_02;
    }

    public aa_0 h() {
        aa_0 aa_02 = new aa_0(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            aa_02.d = this.b;
        } else {
            aa_02.d = this.c.build();
        }
        this.onBuilt();
        return aa_02;
    }

    public ac_0 i() {
        return (ac_0)super.clone();
    }

    public ac_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ac_0)super.setField(fieldDescriptor, object);
    }

    public ac_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ac_0)super.clearField(fieldDescriptor);
    }

    public ac_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ac_0)super.clearOneof(oneofDescriptor);
    }

    public ac_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ac_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ac_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ac_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ac_0 a(Message message) {
        if (message instanceof aa_0) {
            return this.a((aa_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ac_0 a(aa_0 aa_02) {
        if (aa_02 == aa_0.h()) {
            return this;
        }
        if (this.c == null) {
            if (!aa_02.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = aa_02.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(aa_02.d);
                }
                this.onChanged();
            }
        } else if (!aa_02.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = aa_02.d;
                this.a &= 0xFFFFFFFE;
                this.c = aa_0.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(aa_02.d);
            }
        }
        this.b(aa_0.b(aa_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ac_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        aa_0 aa_02 = null;
        try {
            aa_02 = (aa_0)aa_0.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            aa_02 = (aa_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (aa_02 != null) {
                this.a(aa_02);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<ae_0>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<ae_0> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public ae_0 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (ae_0)this.c.getMessage(n);
    }

    public ac_0 a(int n, ae_0 ae_02) {
        if (this.c == null) {
            if (ae_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, ae_02);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)ae_02);
        }
        return this;
    }

    public ac_0 a(int n, ag_0 ag_02) {
        if (this.c == null) {
            this.n();
            this.b.set(n, ag_02.h());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)ag_02.h());
        }
        return this;
    }

    public ac_0 a(ae_0 ae_02) {
        if (this.c == null) {
            if (ae_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(ae_02);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)ae_02);
        }
        return this;
    }

    public ac_0 b(int n, ae_0 ae_02) {
        if (this.c == null) {
            if (ae_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, ae_02);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)ae_02);
        }
        return this;
    }

    public ac_0 a(ag_0 ag_02) {
        if (this.c == null) {
            this.n();
            this.b.add(ag_02.h());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)ag_02.h());
        }
        return this;
    }

    public ac_0 b(int n, ag_0 ag_02) {
        if (this.c == null) {
            this.n();
            this.b.add(n, ag_02.h());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)ag_02.h());
        }
        return this;
    }

    public ac_0 a(Iterable<? extends ae_0> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public ac_0 j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public ac_0 c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public ag_0 d(int n) {
        return (ag_0)this.o().getBuilder(n);
    }

    @Override
    public ah_0 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (ah_0)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends ah_0> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public ag_0 k() {
        return (ag_0)this.o().addBuilder((AbstractMessage)ae_0.i());
    }

    public ag_0 e(int n) {
        return (ag_0)this.o().addBuilder(n, (AbstractMessage)ae_0.i());
    }

    public List<ag_0> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<ae_0, ag_0, ah_0> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final ac_0 a(UnknownFieldSet unknownFieldSet) {
        return (ac_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ac_0 b(UnknownFieldSet unknownFieldSet) {
        return (ac_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
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
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
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
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}


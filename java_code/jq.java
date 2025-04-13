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

public final class jq
extends GeneratedMessageV3.Builder<jq>
implements jr {
    private int a;
    private int b;
    private List<jg_0> c = Collections.emptyList();
    private RepeatedFieldBuilderV3<jg_0, ji_0, jj_0> d;
    private List<jc_0> e = Collections.emptyList();
    private RepeatedFieldBuilderV3<jc_0, je_0, jf_0> f;

    public static final Descriptors.Descriptor a() {
        return iw_0.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iw_0.d.ensureFieldAccessorsInitialized(jo.class, jq.class);
    }

    jq() {
        this.v();
    }

    jq(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.v();
    }

    private void v() {
        if (jo.p()) {
            this.x();
            this.z();
        }
    }

    public jq j() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
        } else {
            this.d.clear();
        }
        if (this.f == null) {
            this.e = Collections.emptyList();
            this.a &= 0xFFFFFFFB;
        } else {
            this.f.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return iw_0.c;
    }

    public jo k() {
        return jo.m();
    }

    public jo l() {
        jo jo2 = this.m();
        if (!jo2.isInitialized()) {
            throw jq.newUninitializedMessageException((Message)jo2);
        }
        return jo2;
    }

    public jo m() {
        jo jo2 = new jo(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        jo2.g = this.b;
        if (this.d == null) {
            if ((this.a & 2) == 2) {
                this.c = Collections.unmodifiableList(this.c);
                this.a &= 0xFFFFFFFD;
            }
            jo2.h = this.c;
        } else {
            jo2.h = this.d.build();
        }
        if (this.f == null) {
            if ((this.a & 4) == 4) {
                this.e = Collections.unmodifiableList(this.e);
                this.a &= 0xFFFFFFFB;
            }
            jo2.i = this.e;
        } else {
            jo2.i = this.f.build();
        }
        jo2.f = n2;
        this.onBuilt();
        return jo2;
    }

    public jq n() {
        return (jq)super.clone();
    }

    public jq a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jq)super.setField(fieldDescriptor, object);
    }

    public jq a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (jq)super.clearField(fieldDescriptor);
    }

    public jq a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (jq)super.clearOneof(oneofDescriptor);
    }

    public jq a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (jq)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public jq b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jq)super.addRepeatedField(fieldDescriptor, object);
    }

    public jq a(Message message) {
        if (message instanceof jo) {
            return this.a((jo)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public jq a(jo jo2) {
        if (jo2 == jo.m()) {
            return this;
        }
        if (jo2.b()) {
            this.e(jo2.c());
        }
        if (this.d == null) {
            if (!jo2.h.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = jo2.h;
                    this.a &= 0xFFFFFFFD;
                } else {
                    this.w();
                    this.c.addAll(jo2.h);
                }
                this.onChanged();
            }
        } else if (!jo2.h.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d.dispose();
                this.d = null;
                this.c = jo2.h;
                this.a &= 0xFFFFFFFD;
                this.d = jo.q() ? this.x() : null;
            } else {
                this.d.addAllMessages(jo2.h);
            }
        }
        if (this.f == null) {
            if (!jo2.i.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = jo2.i;
                    this.a &= 0xFFFFFFFB;
                } else {
                    this.y();
                    this.e.addAll(jo2.i);
                }
                this.onChanged();
            }
        } else if (!jo2.i.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f.dispose();
                this.f = null;
                this.e = jo2.i;
                this.a &= 0xFFFFFFFB;
                this.f = jo.r() ? this.z() : null;
            } else {
                this.f.addAllMessages(jo2.i);
            }
        }
        this.b(jo.b(jo2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        if (!this.b()) {
            return false;
        }
        for (n = 0; n < this.f(); ++n) {
            if (this.a(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.i(); ++n) {
            if (this.c(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public jq a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jo jo2 = null;
        try {
            jo2 = (jo)jo.d.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jo2 = (jo)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jo2 != null) {
                this.a(jo2);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public int c() {
        return this.b;
    }

    public jq e(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public jq o() {
        this.a &= 0xFFFFFFFE;
        this.b = 0;
        this.onChanged();
        return this;
    }

    private void w() {
        if ((this.a & 2) != 2) {
            this.c = new ArrayList<jg_0>(this.c);
            this.a |= 2;
        }
    }

    @Override
    public List<jg_0> d() {
        if (this.d == null) {
            return Collections.unmodifiableList(this.c);
        }
        return this.d.getMessageList();
    }

    @Override
    public int f() {
        if (this.d == null) {
            return this.c.size();
        }
        return this.d.getCount();
    }

    @Override
    public jg_0 a(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (jg_0)this.d.getMessage(n);
    }

    public jq a(int n, jg_0 jg_02) {
        if (this.d == null) {
            if (jg_02 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.c.set(n, jg_02);
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)jg_02);
        }
        return this;
    }

    public jq a(int n, ji_0 ji_02) {
        if (this.d == null) {
            this.w();
            this.c.set(n, ji_02.A());
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)ji_02.A());
        }
        return this;
    }

    public jq a(jg_0 jg_02) {
        if (this.d == null) {
            if (jg_02 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.c.add(jg_02);
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)jg_02);
        }
        return this;
    }

    public jq b(int n, jg_0 jg_02) {
        if (this.d == null) {
            if (jg_02 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.c.add(n, jg_02);
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)jg_02);
        }
        return this;
    }

    public jq a(ji_0 ji_02) {
        if (this.d == null) {
            this.w();
            this.c.add(ji_02.A());
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)ji_02.A());
        }
        return this;
    }

    public jq b(int n, ji_0 ji_02) {
        if (this.d == null) {
            this.w();
            this.c.add(n, ji_02.A());
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)ji_02.A());
        }
        return this;
    }

    public jq a(Iterable<? extends jg_0> iterable) {
        if (this.d == null) {
            this.w();
            AbstractMessageLite.Builder.addAll(iterable, this.c);
            this.onChanged();
        } else {
            this.d.addAllMessages(iterable);
        }
        return this;
    }

    public jq p() {
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.d.clear();
        }
        return this;
    }

    public jq f(int n) {
        if (this.d == null) {
            this.w();
            this.c.remove(n);
            this.onChanged();
        } else {
            this.d.remove(n);
        }
        return this;
    }

    public ji_0 g(int n) {
        return (ji_0)this.x().getBuilder(n);
    }

    @Override
    public jj_0 b(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (jj_0)this.d.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends jj_0> e() {
        if (this.d != null) {
            return this.d.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.c);
    }

    public ji_0 q() {
        return (ji_0)this.x().addBuilder((AbstractMessage)jg_0.B());
    }

    public ji_0 h(int n) {
        return (ji_0)this.x().addBuilder(n, (AbstractMessage)jg_0.B());
    }

    public List<ji_0> r() {
        return this.x().getBuilderList();
    }

    private RepeatedFieldBuilderV3<jg_0, ji_0, jj_0> x() {
        if (this.d == null) {
            this.d = new RepeatedFieldBuilderV3(this.c, (this.a & 2) == 2, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    private void y() {
        if ((this.a & 4) != 4) {
            this.e = new ArrayList<jc_0>(this.e);
            this.a |= 4;
        }
    }

    @Override
    public List<jc_0> g() {
        if (this.f == null) {
            return Collections.unmodifiableList(this.e);
        }
        return this.f.getMessageList();
    }

    @Override
    public int i() {
        if (this.f == null) {
            return this.e.size();
        }
        return this.f.getCount();
    }

    @Override
    public jc_0 c(int n) {
        if (this.f == null) {
            return this.e.get(n);
        }
        return (jc_0)this.f.getMessage(n);
    }

    public jq a(int n, jc_0 jc_02) {
        if (this.f == null) {
            if (jc_02 == null) {
                throw new NullPointerException();
            }
            this.y();
            this.e.set(n, jc_02);
            this.onChanged();
        } else {
            this.f.setMessage(n, (AbstractMessage)jc_02);
        }
        return this;
    }

    public jq a(int n, je_0 je_02) {
        if (this.f == null) {
            this.y();
            this.e.set(n, je_02.r());
            this.onChanged();
        } else {
            this.f.setMessage(n, (AbstractMessage)je_02.r());
        }
        return this;
    }

    public jq a(jc_0 jc_02) {
        if (this.f == null) {
            if (jc_02 == null) {
                throw new NullPointerException();
            }
            this.y();
            this.e.add(jc_02);
            this.onChanged();
        } else {
            this.f.addMessage((AbstractMessage)jc_02);
        }
        return this;
    }

    public jq b(int n, jc_0 jc_02) {
        if (this.f == null) {
            if (jc_02 == null) {
                throw new NullPointerException();
            }
            this.y();
            this.e.add(n, jc_02);
            this.onChanged();
        } else {
            this.f.addMessage(n, (AbstractMessage)jc_02);
        }
        return this;
    }

    public jq a(je_0 je_02) {
        if (this.f == null) {
            this.y();
            this.e.add(je_02.r());
            this.onChanged();
        } else {
            this.f.addMessage((AbstractMessage)je_02.r());
        }
        return this;
    }

    public jq b(int n, je_0 je_02) {
        if (this.f == null) {
            this.y();
            this.e.add(n, je_02.r());
            this.onChanged();
        } else {
            this.f.addMessage(n, (AbstractMessage)je_02.r());
        }
        return this;
    }

    public jq b(Iterable<? extends jc_0> iterable) {
        if (this.f == null) {
            this.y();
            AbstractMessageLite.Builder.addAll(iterable, this.e);
            this.onChanged();
        } else {
            this.f.addAllMessages(iterable);
        }
        return this;
    }

    public jq s() {
        if (this.f == null) {
            this.e = Collections.emptyList();
            this.a &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.f.clear();
        }
        return this;
    }

    public jq i(int n) {
        if (this.f == null) {
            this.y();
            this.e.remove(n);
            this.onChanged();
        } else {
            this.f.remove(n);
        }
        return this;
    }

    public je_0 j(int n) {
        return (je_0)this.z().getBuilder(n);
    }

    @Override
    public jf_0 d(int n) {
        if (this.f == null) {
            return this.e.get(n);
        }
        return (jf_0)this.f.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends jf_0> h() {
        if (this.f != null) {
            return this.f.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.e);
    }

    public je_0 t() {
        return (je_0)this.z().addBuilder((AbstractMessage)jc_0.s());
    }

    public je_0 k(int n) {
        return (je_0)this.z().addBuilder(n, (AbstractMessage)jc_0.s());
    }

    public List<je_0> u() {
        return this.z().getBuilderList();
    }

    private RepeatedFieldBuilderV3<jc_0, je_0, jf_0> z() {
        if (this.f == null) {
            this.f = new RepeatedFieldBuilderV3(this.e, (this.a & 4) == 4, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.e = null;
        }
        return this.f;
    }

    public final jq a(UnknownFieldSet unknownFieldSet) {
        return (jq)super.setUnknownFields(unknownFieldSet);
    }

    public final jq b(UnknownFieldSet unknownFieldSet) {
        return (jq)super.mergeUnknownFields(unknownFieldSet);
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
        return this.j();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.n();
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
        return this.j();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.n();
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
        return this.n();
    }

    public /* synthetic */ Message buildPartial() {
        return this.m();
    }

    public /* synthetic */ Message build() {
        return this.l();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.m();
    }

    public /* synthetic */ MessageLite build() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ Object clone() {
        return this.n();
    }
}


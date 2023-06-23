import { Component } from '@angular/core';
import { Disciplina } from './disciplina.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  selecionado = null
  disciplinas = [
    new Disciplina('Língua Portuguesa', 'Mussum Ipsum, cacilds vidis litro abertis. Mé faiz elementum girarzis, nisi eros vermeio.Suco de cevadiss deixa as pessoas mais interessantis.Aenean aliquam molestie leo, vitae iaculis nisl.Praesent vel viverra nisi. Mauris aliquet nunc non turpis scelerisque, eget.'),
    new Disciplina('Arte', 'Mussum Ipsum, cacilds vidis litro abertis. Mé faiz elementum girarzis, nisi eros vermeio.Suco de cevadiss deixa as pessoas mais interessantis.Aenean aliquam molestie leo, vitae iaculis nisl.Praesent vel viverra nisi. Mauris aliquet nunc non turpis scelerisque, eget.'),
    new Disciplina('Educação Física', 'Mussum Ipsum, cacilds vidis litro abertis. Mé faiz elementum girarzis, nisi eros vermeio.Suco de cevadiss deixa as pessoas mais interessantis.Aenean aliquam molestie leo, vitae iaculis nisl.Praesent vel viverra nisi. Mauris aliquet nunc non turpis scelerisque, eget.'),
    new Disciplina('Matemática', 'Mussum Ipsum, cacilds vidis litro abertis. Mé faiz elementum girarzis, nisi eros vermeio.Suco de cevadiss deixa as pessoas mais interessantis.Aenean aliquam molestie leo, vitae iaculis nisl.Praesent vel viverra nisi. Mauris aliquet nunc non turpis scelerisque, eget.'),
    new Disciplina('História', 'Mussum Ipsum, cacilds vidis litro abertis. Mé faiz elementum girarzis, nisi eros vermeio.Suco de cevadiss deixa as pessoas mais interessantis.Aenean aliquam molestie leo, vitae iaculis nisl.Praesent vel viverra nisi. Mauris aliquet nunc non turpis scelerisque, eget.'),
    new Disciplina('Geografia', 'Mussum Ipsum, cacilds vidis litro abertis. Mé faiz elementum girarzis, nisi eros vermeio.Suco de cevadiss deixa as pessoas mais interessantis.Aenean aliquam molestie leo, vitae iaculis nisl.Praesent vel viverra nisi. Mauris aliquet nunc non turpis scelerisque, eget.'),
    new Disciplina('Ciências', 'Mussum Ipsum, cacilds vidis litro abertis. Mé faiz elementum girarzis, nisi eros vermeio.Suco de cevadiss deixa as pessoas mais interessantis.Aenean aliquam molestie leo, vitae iaculis nisl.Praesent vel viverra nisi. Mauris aliquet nunc non turpis scelerisque, eget.'),
    new Disciplina('Redação', 'Mussum Ipsum, cacilds vidis litro abertis. Mé faiz elementum girarzis, nisi eros vermeio.Suco de cevadiss deixa as pessoas mais interessantis.Aenean aliquam molestie leo, vitae iaculis nisl.Praesent vel viverra nisi. Mauris aliquet nunc non turpis scelerisque, eget.'),
    new Disciplina('Língua Estrangeira Moderna - Inglês', 'Mussum Ipsum, cacilds vidis litro abertis. Mé faiz elementum girarzis, nisi eros vermeio.Suco de cevadiss deixa as pessoas mais interessantis.Aenean aliquam molestie leo, vitae iaculis nisl.Praesent vel viverra nisi. Mauris aliquet nunc non turpis scelerisque, eget.'),
    new Disciplina('Ensino Religioso', 'Mussum Ipsum, cacilds vidis litro abertis. Mé faiz elementum girarzis, nisi eros vermeio.Suco de cevadiss deixa as pessoas mais interessantis.Aenean aliquam molestie leo, vitae iaculis nisl.Praesent vel viverra nisi. Mauris aliquet nunc non turpis scelerisque, eget.'),
  ];

  selecionar(disciplina: any) {
    this.selecionado = disciplina;
  }
}

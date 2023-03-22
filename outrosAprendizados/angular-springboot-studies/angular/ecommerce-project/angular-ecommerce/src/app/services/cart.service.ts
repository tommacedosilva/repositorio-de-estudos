import { Injectable } from '@angular/core';
import { CartItem } from '../common/cart-item';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  
  cartItems: CartItem[] = [];

  totalPrice: Subject<number> = new Subject<number>();
  totalQuantity: Subject<number> = new Subject<number>();

  constructor() { }

  addToCart(theCartItem: CartItem) {

    // checar se já tem o item no carrinho
    let alreadyExistsInCart: boolean = false;
    let existingCartItem: CartItem = undefined;

    if (this.cartItems.length > 0) {
      // encontrar o item no carrinho baseado no id

      existingCartItem = this.cartItems.find(tempCartItem => tempCartItem.id === theCartItem.id);

      // checar se encontrou
      alreadyExistsInCart = (existingCartItem != undefined);

    }
    
    if (alreadyExistsInCart) {
      // incrementa o quantity
      existingCartItem.quantity++;
    }
    else {
      // apenas adc item para o array
      this.cartItems.push(theCartItem);
    }

    // calcular preço total do carrinho e quantidade total
    this.computerCartTotals();
  }

  computerCartTotals() {
    
    let totalPriceValue: number = 0;
    let totalQuantityValue: number = 0;

    for (let currentCartItem of this.cartItems) {
      totalPriceValue += currentCartItem.quantity * currentCartItem.unitPrice;
      totalQuantityValue += currentCartItem.quantity;
    }

    // publicar os novos valores, todos os inscritos vão receber o novo dado
    this.totalPrice.next(totalPriceValue);
    this.totalQuantity.next(totalQuantityValue);

    // log dos dados do carrinho para debug
    this.logCartData(totalPriceValue, totalQuantityValue);
  }

  logCartData(totalPriceValue: number, totalQuantityValue: number) {
    
    console.log(`Contents of the cart`);
    for (let tempCartItem of this.cartItems) {
      const subTotalPrice = tempCartItem.quantity * tempCartItem.unitPrice;
      console.log(`name: ${tempCartItem.name}, quantity=${tempCartItem.quantity}, unitPrice=${tempCartItem.unitPrice}, subTotalPrice=${subTotalPrice}`);
    }

    console.log(`totalPrice: ${totalPriceValue.toFixed(2)} totalQuantity: ${totalQuantityValue}`);
    console.log(`----`);

  }

  decrementQuantity(theCartItem: CartItem) {
    theCartItem.quantity--;

    if (theCartItem.quantity === 0) {
      this.remove(theCartItem);
    }
    else {
      this.computerCartTotals();
    }
  }

  remove(theCartItem: CartItem) {
    
    // obter o index dos item no array
    const itemIndex = this.cartItems.findIndex( tempCartItem => tempCartItem.id === theCartItem.id );

    // se encontrado, remover item do array no index dado
    if (itemIndex > -1) {
      this.cartItems.splice(itemIndex, 1);

      this.computerCartTotals();
    }

  }

  

}

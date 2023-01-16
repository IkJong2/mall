
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManagementManager from "./components/listers/OrderManagementCards"
import OrderManagementDetail from "./components/listers/OrderManagementDetail"

import SelectProductView from "./components/SelectProductView"
import SelectProductViewDetail from "./components/SelectProductViewDetail"
import CheckReservationView from "./components/CheckReservationView"
import CheckReservationViewDetail from "./components/CheckReservationViewDetail"
import DeliveryManagementManager from "./components/listers/DeliveryManagementCards"
import DeliveryManagementDetail from "./components/listers/DeliveryManagementDetail"

import InventoryManagementManager from "./components/listers/InventoryManagementCards"
import InventoryManagementDetail from "./components/listers/InventoryManagementDetail"

import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"

import InventoryManager from "./components/listers/InventoryCards"
import InventoryDetail from "./components/listers/InventoryDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orderManagements',
                name: 'OrderManagementManager',
                component: OrderManagementManager
            },
            {
                path: '/orderManagements/:id',
                name: 'OrderManagementDetail',
                component: OrderManagementDetail
            },

            {
                path: '/selectProducts',
                name: 'SelectProductView',
                component: SelectProductView
            },
            {
                path: '/selectProducts/:id',
                name: 'SelectProductViewDetail',
                component: SelectProductViewDetail
            },
            {
                path: '/checkReservations',
                name: 'CheckReservationView',
                component: CheckReservationView
            },
            {
                path: '/checkReservations/:id',
                name: 'CheckReservationViewDetail',
                component: CheckReservationViewDetail
            },
            {
                path: '/deliveryManagements',
                name: 'DeliveryManagementManager',
                component: DeliveryManagementManager
            },
            {
                path: '/deliveryManagements/:id',
                name: 'DeliveryManagementDetail',
                component: DeliveryManagementDetail
            },

            {
                path: '/inventoryManagements',
                name: 'InventoryManagementManager',
                component: InventoryManagementManager
            },
            {
                path: '/inventoryManagements/:id',
                name: 'InventoryManagementDetail',
                component: InventoryManagementDetail
            },

            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },

            {
                path: '/inventories',
                name: 'InventoryManager',
                component: InventoryManager
            },
            {
                path: '/inventories/:id',
                name: 'InventoryDetail',
                component: InventoryDetail
            },



    ]
})

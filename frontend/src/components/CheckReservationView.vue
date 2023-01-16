<template>

    <v-data-table
        :headers="headers"
        :items="checkReservation"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'CheckReservationView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            checkReservation : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/checkReservations'))

            temp.data._embedded.checkReservations.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.checkReservation = temp.data._embedded.checkReservations;
        },
        methods: {
        }
    }
</script>

